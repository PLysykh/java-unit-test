@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        // Напиши код здесь
        assertEquals("If the test fails, than the age is under 18: ", true, isAdult);
        }