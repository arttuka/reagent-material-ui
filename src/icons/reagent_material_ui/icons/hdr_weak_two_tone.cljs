(ns reagent-material-ui.icons.hdr-weak-two-tone
  "Imports @material-ui/icons/HdrWeakTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def hdr-weak-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 6c-3.31 0-6 2.69-6 6s2.69 6 6 6 6-2.69 6-6-2.69-6-6-6zm0 10c-2.21 0-4-1.79-4-4s1.79-4 4-4 4 1.79 4 4-1.79 4-4 4z"}) (e "circle" #js {"cy" "12", "r" "2", "cx" "5", "opacity" ".3"}) (e "path" #js {"d" "M5 8c-2.21 0-4 1.79-4 4s1.79 4 4 4 4-1.79 4-4-1.79-4-4-4zm0 6c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"}))
                                        "HdrWeakTwoTone"))
