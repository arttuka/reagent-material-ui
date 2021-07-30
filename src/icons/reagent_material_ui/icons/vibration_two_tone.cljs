(ns reagent-material-ui.icons.vibration-two-tone
  "Imports @material-ui/icons/VibrationTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def vibration-two-tone (create-svg-icon [(e "path" #js {"d" "M8 5h8v14H8z", "opacity" ".3"}) (e "path" #js {"d" "M19 7h2v10h-2zm3 2h2v6h-2zM0 9h2v6H0zm16.5-6h-9C6.67 3 6 3.67 6 4.5v15c0 .83.67 1.5 1.5 1.5h9c.83 0 1.5-.67 1.5-1.5v-15c0-.83-.67-1.5-1.5-1.5zM16 19H8V5h8v14zM3 7h2v10H3z"})]
                                         "VibrationTwoTone"))
