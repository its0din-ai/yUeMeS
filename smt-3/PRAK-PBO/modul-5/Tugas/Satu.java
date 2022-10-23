package Tugas;

public class Satu {
    String namaAgent, idAgent, jobdeskAgent;

    public Satu(){
        System.out.println("Selamat Datang di Sistem Informasi Intelijen");
    }

    public Satu(String namaAgent, String idAgent, String jobdeskAgent){
        this.namaAgent = namaAgent;
        this.idAgent = idAgent;
        this.jobdeskAgent = jobdeskAgent;
    }

    public void ingfo(){
        System.out.println("===================================\n" + "Nama Agent: " + namaAgent + "\nID Agent: " + idAgent + "\nJobdesk Agent: " + jobdeskAgent + "\n");
    }
}
