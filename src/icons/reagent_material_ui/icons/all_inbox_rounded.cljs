(ns reagent-material-ui.icons.all-inbox-rounded
  "Imports @material-ui/icons/AllInboxRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def all-inbox-rounded (create-svg-icon (e "path" #js {"d" "M3 6c-.55 0-1 .45-1 1v13c0 1.1.9 2 2 2h13c.55 0 1-.45 1-1s-.45-1-1-1H4V7c0-.55-.45-1-1-1zm17-4H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 9h-3.15c-.42 0-.82.24-.95.63-.27.8-1.02 1.37-1.9 1.37s-1.63-.57-1.9-1.37c-.13-.39-.54-.63-.95-.63H8V4h12v7z"})
                                        "AllInboxRounded"))
