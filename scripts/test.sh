#!/usr/bin/env bash
set -euo pipefail

if [[ -f /Applications/Google\ Chrome.app/Contents/MacOS/Google\ Chrome ]]; then
    chrome=/Applications/Google\ Chrome.app/Contents/MacOS/Google\ Chrome
else
    chrome="google-chrome-stable"
fi

exec "$chrome" --headless --disable-gpu --repl "$@"
