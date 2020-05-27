package ru.job4j.collection;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.*;

public class JobTest {

    @Test
    public void whenJobDescByName() {
        List<Job> jobs = Arrays.asList(new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0));
        Iterator<Job> it  = jobs.iterator();
        Collections.sort(jobs, new JobDescByName());
        assertThat(it.next().getName(), is("X task"));
    }
    @Test
    public void whenJobDescByPriority() {
        List<Job> jobs = Arrays.asList(new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0));
        Iterator<Job> it  = jobs.iterator();
        Collections.sort(jobs, new JobDescByPriority());
        assertThat(it.next().toString(), is(new Job("Fix bug", 4).toString()));
    }
    @Test
    public void whenJobAscByName() {
        List<Job> jobs = Arrays.asList(new Job("AFix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0));
        Iterator<Job> it  = jobs.iterator();
        Collections.sort(jobs, new JobAscByName());
        assertThat(it.next().toString(), is(new Job("AFix bug", 1).toString()));
    }
    @Test
    public void whenJobAscByPriority() {
        List<Job> jobs = Arrays.asList(new Job("AFix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0));
        Iterator<Job> it  = jobs.iterator();
        Collections.sort(jobs, new JobAscByPriority());
        assertThat(it.next().toString(), is(new Job("X task", 0).toString()));
    }
    @Test
    public void whenComparatorDescNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorAscNameAndPriority() {
        Comparator<Job> cmpNameAndPriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNameAndPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenComparatorDescPriorityAndName() {
        Comparator<Job> cmpPriorityAndName = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpPriorityAndName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenComparatorAscPriorityAndName() {
        Comparator<Job> cmpPriorityAndName = new JobAscByPriority().thenComparing(new JobAscByName());
        int rsl = cmpPriorityAndName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenAscNameAndPriorityJobs() {
        List<Job> jobs = Arrays.asList(new Job("AFix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0));
        Iterator<Job> it  = jobs.iterator();
        Collections.sort(jobs, new JobAscByName().thenComparing(new JobAscByPriority()));
        assertThat(it.next().toString(), is(new Job("AFix bug", 1).toString()));
        assertThat(it.next().toString(), is(new Job("Fix bug", 2).toString()));
        assertThat(it.next().toString(), is(new Job("Fix bug", 4).toString()));
        assertThat(it.next().toString(), is(new Job("X task", 0).toString()));
    }
}
