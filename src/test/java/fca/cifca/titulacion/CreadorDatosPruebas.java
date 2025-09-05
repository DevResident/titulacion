package fca.cifca.titulacion;

import fca.cifca.titulacion.models.*;
import java.time.LocalDate;

public class CreadorDatosPruebas {

    public static InstitucionModel crearInstitucion() {

        InstitucionModel institucionModel = new InstitucionModel();
        institucionModel.setIdInstitucion(1);
        institucionModel.setIdInstitucion(2);
        institucionModel.setIdDomicilio(3);
        institucionModel.setNombre("Institucion de prueba");
        institucionModel.setNivel("1");
        institucionModel.setTipo("N");
        institucionModel.setAbreviatura("INSTPR");
        institucionModel.setClaveUnam("CLAVE1");
        institucionModel.setUrlPagina("https://instpr.net");
        institucionModel.setEsAfiliadAnfeca(Boolean.TRUE);
        institucionModel.setRutaLogotipo("/dev/null");
        institucionModel.setSistema("Sistema");
        institucionModel.setCategoriaUnam(null);
        institucionModel.setTipoAfiliacionAnfeca("Asociada");
        institucionModel.setIdInstitucionSede(2);
        institucionModel.setIdPais(2);
        institucionModel.setIdSectorServicio(2);
        institucionModel.setSector("Sector");

        return institucionModel;

    }

    public static NivelAcademicoModel crearNivelAcademico() {

        NivelAcademicoModel nivelAcademicoModel = new NivelAcademicoModel();
        nivelAcademicoModel.setIdNivelAcademico(2666);
        nivelAcademicoModel.setNivelAcademicoOrden(1);
        nivelAcademicoModel.setNivelAcademicoAbv1("ALV");
        nivelAcademicoModel.setNivelAcademicoAbv2("PTM");

        return nivelAcademicoModel;

    }

    public static AreaCarreraModel crearAreaCarrera() {

        AreaCarreraModel areaCarreraModel = new AreaCarreraModel();
        areaCarreraModel.setIdAreaCarrera(222);
        areaCarreraModel.setNombre("Area de carrera de prueba");

        return areaCarreraModel;

    }

    public static PaisModel crearPais() {

        PaisModel paisModel = new PaisModel();
        paisModel.setPais_id_pais(2);
        paisModel.setPais_nacionalidad("Azerbajaní");
        paisModel.setPais_nombre("Azerbaján");
        paisModel.setPais_cve_lada("1122334455");
        return paisModel;

    }

    public static PlanEstudioModel crearPlanEstudio() {

        PlanEstudioModel planEstudioModel = new PlanEstudioModel();
        planEstudioModel.setPles_id_plan_estudio(1);
        planEstudioModel.setPles_id_carrera(crearCarrera());
        planEstudioModel.setPles_nombre("Plan Estudio");
        planEstudioModel.setPles_nivel("L");
        planEstudioModel.setPles_sistema("Sistema");
        planEstudioModel.setPles_prim_gen(2022);
        planEstudioModel.setPles_plan("E");
        planEstudioModel.setPles_duracion(10);
        planEstudioModel.setPles_num_cred_oblig(352);
        planEstudioModel.setPles_num_cred_opta(56);
        planEstudioModel.setPles_vigencia(1);
        planEstudioModel.setPles_tipo_programa(1);
        planEstudioModel.setPles_num_asig_cred_flex(null);
        planEstudioModel.setPles_cred_seminario(null);

        return planEstudioModel;

    }

    public static PersonaModel crearPersona() {

        PersonaModel personaModel = new PersonaModel();
        personaModel.setPers_id_persona(1);
        personaModel.setPers_nombre("Juan");
        personaModel.setPers_apaterno("Rulfo");
        personaModel.setPers_amaterno(null);
        personaModel.setPers_rfc("OEMD0408105L5");
        personaModel.setPers_curp("OEMD040810HDFRLGA6");
        personaModel.setArea(null);
        personaModel.setPuesto(null);
        personaModel.setPers_tipo_puesto(null);
        personaModel.setEstudioProfesional(null);
        personaModel.setPers_es_temporal(null);
        personaModel.setPers_id_pais(crearPais());
        personaModel.setPers_fec_nac(LocalDate.now());
        personaModel.setPers_sexo("M");
        personaModel.setPers_tipo("A");
        personaModel.setPers_no_inmigrante(null);
        personaModel.setPers_foto_titular(null);
        personaModel.setPers_grado_academico(null);
        personaModel.setPers_cedula_identidad(null);
        personaModel.setDomicilio(null);
        personaModel.setPers_nombre_acento(null);
        personaModel.setPers_primer_apellido_acento(null);
        personaModel.setPers_segundo_apellido_acento(null);

        return personaModel;

    }

    public static CarrerasModel crearCarrera() {

        CarrerasModel carreraModel = new CarrerasModel();
        carreraModel.setIdCarrera(1);
        carreraModel.setClaveCarrera("12345678");
        carreraModel.setNombreCarrera("Carrera de prueba");
        carreraModel.setAreaCarrera(crearAreaCarrera());
        carreraModel.setNivelAcademico(crearNivelAcademico());

        return carreraModel;

    }

    public static CarreraPlantelModel crearCarreraPlantel() {

        CarreraPlantelModel carreraPlantelModel = new CarreraPlantelModel();
        carreraPlantelModel.setIdCarreraPlantel(1);
        carreraPlantelModel.setCarrera(crearCarrera());
        carreraPlantelModel.setInstitucion(crearInstitucion());

        return carreraPlantelModel;

    }

    public static AlumnoModel crearAlumno() {

        AlumnoModel alumnoModel = new AlumnoModel();
        alumnoModel.setIdAlumno(20595);
        alumnoModel.setIdCarreraPlantel(crearCarreraPlantel());
        alumnoModel.setIdPlanEstudio(crearPlanEstudio());
        alumnoModel.setGeneracion("2020");
        alumnoModel.setEsTitulado("N");
        alumnoModel.setSistema("ESC");
        alumnoModel.setPromedio(9.54);
        alumnoModel.setIdPersona(crearPersona());
        alumnoModel.setNumeroCuenta("320247568");
        alumnoModel.setIngreso(null);
        alumnoModel.setEgreso(null);

        return alumnoModel;

    }

}