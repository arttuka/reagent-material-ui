(ns reagent-material-ui.icons.seven-k-rounded
  "Imports @material-ui/icons/SevenKRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def seven-k-rounded (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM8.95 15h-.19c-.5 0-.86-.49-.72-.97l1.08-3.53H7.25c-.41 0-.75-.34-.75-.75S6.84 9 7.25 9H10c.67 0 1.15.65.96 1.29l-1.3 4.18c-.09.32-.38.53-.71.53zm7.64 0c-.22 0-.42-.1-.55-.27l-1.54-1.98v1.55c0 .39-.31.7-.7.7h-.1c-.39 0-.7-.31-.7-.7V9.7c0-.39.31-.7.7-.7h.09c.39 0 .7.31.7.7v1.55l1.54-1.98c.14-.17.35-.27.56-.27.58 0 .91.66.56 1.12L15.75 12l1.41 1.88c.34.46.01 1.12-.57 1.12z"})
                                      "SevenKRounded"))
