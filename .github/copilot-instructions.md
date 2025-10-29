## Quick context

- This repository is a tiny single-file Java CLI program: `segitiga.java` located at the repository root.
- There is no package structure or build system (Maven/Gradle). The program uses `java.util.Scanner` to read doubles from standard input and prints results to stdout.

## What to know as an AI editing this repo

- The project is single-file; edits typically touch `segitiga.java`. Keep filename and top-level public class name in sync (Java requires this).
- The program is run directly by compiling the file and then invoking the class: see "Build & run" below.
- Variable naming is informal (e.g., `albani` for the `Scanner`); preserve intent when refactoring and prefer small, low-risk changes.

## Build & run (Windows PowerShell)

1. Compile:

   javac segitiga.java

2. Run:

   java segitiga

Notes: run these commands from the repository root (`c:\segitiga`). If you rename the class, rename the file accordingly and use the new class name when running `java`.

## Code patterns & small examples to reuse

- Input handling: uses `Scanner` reading `double` values from stdin. Example snippet (from file):

  Scanner albani = new Scanner(System.in);
  sisiNya = albani.nextDouble();
  albani.close();

- Single-file CLI: rely only on the JDK (no external deps). If adding tests or more files, introduce a `src/` layout and a lightweight build (Maven/Gradle) and document it in the repo.

## Editing guidance for AI agents

- Keep changes minimal and compile-verified. After edits, always ensure the file compiles with `javac` and runs with `java` before proposing a PR.
- Do NOT change the class name's case without renaming the file. The current class is `segitiga` (lowercase) and the filename is `segitiga.java`.
- When improving logic, include a short rationale in the commit message and keep runtime behavior compatible unless the change is explicitly a bug fix.

## Suggested commit message style

- Use concise messages describing intent, e.g.: `fix: correct area/perimeter calculation in segitiga.java` or `chore: rename variable for clarity in segitiga.java`.

## Quick examples of acceptable AI edits

- Fix a calculation bug but preserve input prompts and output format.
- Add basic validation (e.g., ensure inputs are positive) with graceful messaging.

## What *not* to do

- Do not introduce new frameworks or heavy build systems without explicitly documenting and verifying them.
- Avoid large refactors that split the single file into many files unless you add a minimal build/test setup and run it.

## Where to look for patterns

- `segitiga.java` — canonical example of how I/O and output are done in this repository.

---

If you want I can (a) run the compile+run cycle after any change, (b) suggest a minimal test harness, or (c) migrate this repo to a small `src/` layout with Maven/Gradle — tell me which and I'll prepare it.
