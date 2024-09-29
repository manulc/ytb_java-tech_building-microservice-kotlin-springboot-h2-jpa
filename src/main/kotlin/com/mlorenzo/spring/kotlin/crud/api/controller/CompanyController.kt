package com.mlorenzo.spring.kotlin.crud.api.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.beans.factory.annotation.Autowired

import com.mlorenzo.spring.kotlin.crud.api.repository.CompanyRepository
import com.mlorenzo.spring.kotlin.crud.api.model.Company
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.http.HttpStatus

@RestController
@RequestMapping("companies")
class CompanyController {
	
	/* El modificador lateinit te permite inicializar una propiedad no anulable por fuera del constructor.
	   Este mecanismo te ayuda cuando deseas asignar el valor de una propiedad después y no deseas usar comprobaciones de
 	   nulos (expresiones if, operador de acceso seguro o aserciones) una vez inicializada. */
	@Autowired
	lateinit var companyRepository: CompanyRepository
	
	// En este caso, el tipo de dato devuelto por la función no se ha especificado y, por lo tanto, Kotlin lo infiere automáticamente.
	@GetMapping
	fun getAllCompanies() = companyRepository.findAll()
	
	@GetMapping("{name}")
	fun getCompanyByName(@PathVariable name: String): Company {
		return companyRepository.findByName(name)
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	fun save(@RequestBody company: Company): String {
		companyRepository.save(company)
		return "Company details saved!"
	}
	
	@DeleteMapping("{id}")
	fun deleteCompanyById(@PathVariable id: Int): String {
		companyRepository.delete(id)
		return "Company deleted!"
	}
	
	
}