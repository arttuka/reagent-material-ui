(ns reagent-material-ui.icons.margin-two-tone
  "Imports @material-ui/icons/MarginTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def margin-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 19h14V5H5v14zM15 7h2v2h-2V7zm0 4h2v2h-2v-2zm-4-4h2v2h-2V7zm0 4h2v2h-2v-2zM7 7h2v2H7V7zm0 4h2v2H7v-2z", "opacity" ".3"}) (e "path" #js {"d" "M7 7h2v2H7zm0 4h2v2H7z"}) (e "path" #js {"d" "M3 3v18h18V3H3zm16 16H5V5h14v14z"}) (e "path" #js {"d" "M11 7h2v2h-2zm4 4h2v2h-2zm-4 0h2v2h-2zm4-4h2v2h-2z"}))
                                      "MarginTwoTone"))
