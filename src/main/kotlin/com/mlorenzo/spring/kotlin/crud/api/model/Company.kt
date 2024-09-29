package com.mlorenzo.spring.kotlin.crud.api.model

import javax.persistence.Table
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue

/* Una clase de Kotlin de tipo Data genera automáticamente los métodos getter y setter de las propiedades
   y, además, también genera los métodos toString, hashCode y equals.
   Nota: Genera los métodos getter y setter para aquellas propiedades declaradas con var(propiedades mutables) y solo
   los métodos getter para aquellas propiedades declarada con val(propiedades inmutables). */

@Entity
@Table(name = "companies")
data class Company(
	@Id
	@GeneratedValue
	val id: Int = 0,
	val name: String = "",
	var address: String = "")