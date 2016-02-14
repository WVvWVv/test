package com.example.school;

/**
 * Created by: Iryna Borysenko
 * Date: 2/13/16
 */

interface Staff {

}

interface Ministers extends Staff {

}

class SportMinister implements Ministers {

}

class EducationMinister implements Ministers {

}

class Director implements Staff {

}

interface HeadTeacher extends Staff {

}

class MainHeadTeacher implements HeadTeacher {

}

class DeputyHeadTeacher implements HeadTeacher {

}

class EducationHeadTeacher implements HeadTeacher {

}

interface Teachers extends Staff {

}

class SeniorTeacher implements Teachers {

}

class DutyTeacher implements Teachers {

}

interface GeographyTeachers extends Teachers {

}

class GeographyTeacher1 implements GeographyTeachers {

}

class GeographyTeacher2 implements GeographyTeachers {

}

class GeographyTeacher3 implements GeographyTeachers {

}

interface PhysicsTeachers extends Teachers {

}

class PhpsicsTeacher1 implements PhysicsTeachers {

}

class PhpsicsTeacher2 implements PhysicsTeachers {

}

class PhpsicsTeacher3 implements PhysicsTeachers {

}

interface MathTeachers extends Teachers {

}

class MathTeacher1 implements MathTeachers {

}

class MathTeacher2 implements MathTeachers {

}

interface ComputerScienсeTeachers extends Teachers {

}

interface RussianLanguageAndLiteratureTeachers extends Teachers {

}

class RussianLanguageAndLiteratureTeacher implements RussianLanguageAndLiteratureTeachers {

}

interface UkrainianLanguageAndLiteratureTeachers extends Teachers {

}

class UkrainianLanguageAndLiteratureTeacher implements UkrainianLanguageAndLiteratureTeachers {

}

class MathPhysicsTeacher1 implements MathTeachers, PhysicsTeachers {

}

class MathPhysicsTeacher2 implements MathTeachers, PhysicsTeachers {

}

class MathCompSienceTeacher implements MathTeachers, ComputerScienсeTeachers {

}

class MathPhysicCompScienceTeacher implements MathTeachers, PhysicsTeachers, ComputerScienсeTeachers {

}

class RussianUkrainianLanguage implements RussianLanguageAndLiteratureTeachers, UkrainianLanguageAndLiteratureTeachers{

}

interface Pupils extends Staff {

}

interface PresidentOfSchool extends Pupils {

}

class CurrentPresidentOfSchool implements PresidentOfSchool {

}

class DeputyPresidentOfSchool implements PresidentOfSchool {

}

class AllPupils implements Pupils {

}

interface Prefects extends Pupils{

}

class Prefect1 implements Prefects {

}

class Prefect2 implements Prefects {

}

class Prefect3 implements Prefects {

}

class DeputyPrefect implements Prefects {

}

interface ParentsCouncil extends Staff {

}

class HeadOfParents implements ParentsCouncil {

}

class MotherOfPrefect1 implements ParentsCouncil {

}

class MyMother implements ParentsCouncil {

}

class MyFather implements ParentsCouncil {

}

interface Superintendents extends Staff {

}

class Superintendent implements Superintendents {

}
