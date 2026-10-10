#!/bin/bash
set -euo pipefail

repo_root="$(cd "$(dirname "$0")/.." && pwd)"
build_dir="$(mktemp -d)"
trap 'rm -rf "$build_dir"' EXIT

cd "$repo_root"
javac -d "$build_dir" Main.java If.java While.java GuessNumber.java JavaGUI.java
printf 'All Java examples compiled successfully.\n'
