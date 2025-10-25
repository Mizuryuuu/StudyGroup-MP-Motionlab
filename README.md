# StudyGroup MP Motionlab

---

## Version Control
Version Control adalah sistem yang digunakan untuk mengelola perubahan pada kode atau dokumen. Dengan version control, developer bisa melacak setiap versi, kembali ke versi sebelumnya, dan berkolaborasi tanpa saling menimpa pekerjaan.
***
## Git
Git adalah salah satu Version Control System, dan git ini digunakan untuk beberapa platform kolaborasi developer seperti contohnya: Github, Gitlab, Bitbucket, Dll.

### Fitur Utama
1) Commit - menyimpan snapshot perubahan
2) Branching - membuat cabang kode baru
3) Merging - menggabungkan perubahan antar branch
4) Revert – membatalkan perubahan
5) Stash – menyimpan perubahan sementara tanpa commit

### Alur Kerja Git(Workflow)
1) Centralized Workflow – semua developer kerja di satu branch (biasanya main).
2) Feature Branch Workflow – setiap fitur dikerjakan di branch terpisah.
3) Gitflow – struktur branch lengkap untuk pengembangan, testing, dan rilis produksi.

### Perintah Dasar 
| Perintah | Fungsi |
|---|---|
|git init |	Membuat repository baru |
|git status | Melihat status perubahan |
|git add | Menambahkan file ke staging area |
|git commit | Menyimpan perubahan |
|git push |	Mengirim commit ke remote (GitHub) |
|git pull |	Mengambil update dari remote |
|git reset | Mengembalikan ke commit tertentu |

### Branching dan Merging
- Branching digunakan untuk membuat jalur pengembangan baru.
- Merging menyatukan perubahan ke branch utama.
- Konflik bisa muncul jika dua orang mengubah bagian kode yang sama — perlu diselesaikan manual.

### Kolaborasi di GitHub
- Fork – menyalin repo orang lain untuk dikembangkan.
- Pull Request – meminta agar perubahan digabung ke repo asal.
- Code Review – pemeriksaan kode sebelum di-merge untuk menjaga kualitas.

### Best Practices
- Commit secara teratur dan beri pesan yang jelas.
- Hindari commit langsung ke branch utama (main/master).
- Lakukan update sebelum merge untuk mencegah konflik.
- Gunakan .gitignore agar file yang tidak penting tidak ikut diunggah.

