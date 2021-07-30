(ns reagent-material-ui.icons.villa-two-tone
  "Imports @material-ui/icons/VillaTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def villa-two-tone (create-svg-icon [(e "path" #js {"d" "m5 9.37 9-3.46V12H9v7H5V9.37zM19 19h-3v-3h-2v3h-3v-5h8v5z", "opacity" ".3"}) (e "path" #js {"d" "M19 10c-1.1 0-2 .9-2 2h-1V3L3 8v13h18v-9c0-1.1-.9-2-2-2zM5 9.37l9-3.46V12H9v7H5V9.37zM19 19h-3v-3h-2v3h-3v-5h8v5z"})]
                                     "VillaTwoTone"))
