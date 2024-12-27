package FinalPetStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import FinalPetStore.entity.NewEntity;
import FinalPetStore.services.NewPetServices;


@Controller
@RequestMapping("/pets")
public class NewController {

	@Autowired
	private NewPetServices ps;
	
	
	@GetMapping("/")
    public String getAllPets(Model model) {
//        List<NewEntity> pets = ps.getAllPets();
        model.addAttribute("newpetstore", ps.getAllPets());
        return "newpetstore"; // The name of your Thymeleaf template (e.g., pets.html)
    }
	
	@GetMapping("/new")
	public String getAllData(Model model) {
		model.addAttribute("pet", new NewEntity());
		return "addpets";
	}
	
	@PostMapping("/save")
	public String saveNewPet(@ModelAttribute NewEntity pet) {
		ps.savePet(pet);
		System.out.println(pet);
		return "redirect:/pets/";
	}
	
	// to update the data of Pet Details--
		@GetMapping("/update/{id}")
		public String updatePet(@PathVariable int id, Model model) {
			NewEntity pet = ps.getById(id);
			if(pet != null) {
				model.addAttribute("pet", pet);
				return "updatepets";
			}
			else {
				return "redirect:/pets/";
			}
		}
		
		@PostMapping("/update/{id}")
		public String updatePet(@PathVariable int id, @ModelAttribute NewEntity pet) {
			
			pet.setId(id);
			ps.savePet(pet);
			return "redirect:/pets/";
			
		}
	
	// for delete the Pet Details--
	@GetMapping("/delete/{id}")
	public String delNewPet(@PathVariable int id) {
		System.out.println(id);
		ps.deletePet(id);
		return "redirect:/pets/";
	}
	
//	@GetMapping("/get")
//    public List<NewEntity> getAllPets() {
//        return ps.getAllPets();
//    }
//	
//	@GetMapping("/get/{id}")
//	public NewEntity getPetsById(@PathVariable int id) {
//		return ps.getById(id);
//	}
//
//    @PostMapping("/post")
//    public ResponseEntity<String> addPet(@RequestBody NewEntity pet) {
//        ps.addPet(pet);
//        return ResponseEntity.ok("Pet added successfully");
//    }
//
//    @PutMapping("/put/{id}")
//    public ResponseEntity<String> updatePet(@PathVariable int id, @RequestBody NewEntity pet) {
//        ps.updatePet(id, pet);
//        return ResponseEntity.ok("Pet updated successfully");
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<String> deletePet(@PathVariable int id) {
//        ps.deletePet(id);
//        return ResponseEntity.ok("Pet deleted successfully");
//    }
	
}
