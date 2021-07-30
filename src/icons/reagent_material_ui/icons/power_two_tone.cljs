(ns reagent-material-ui.icons.power-two-tone
  "Imports @material-ui/icons/PowerTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def power-two-tone (create-svg-icon [(e "path" #js {"d" "m8 13.65 3.5 3.52V19h1v-1.83l3.5-3.51V9H8z", "opacity" ".3"}) (e "path" #js {"d" "M16 7V3h-2v4h-4V3H8v4h-.01C6.89 7 6 7.89 6 8.98v5.52L9.5 18v3h5v-3l3.5-3.5V9c0-1.1-.9-2-2-2zm0 6.66-3.5 3.51V19h-1v-1.83L8 13.65V9h8v4.66z"})]
                                     "PowerTwoTone"))
