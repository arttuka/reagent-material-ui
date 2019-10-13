#!/usr/bin/env bash
set -euxo pipefail

if [[ -f /Applications/Google\ Chrome.app/Contents/MacOS/Google\ Chrome ]]; then
    chrome=/Applications/Google\ Chrome.app/Contents/MacOS/Google\ Chrome
else
    chrome="google-chrome"
fi

exec "$chrome" --headless --disable-gpu --repl "$@"
