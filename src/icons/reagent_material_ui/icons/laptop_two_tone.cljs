(ns reagent-material-ui.icons.laptop-two-tone
  "Imports @material-ui/icons/LaptopTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def laptop-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 6h16v10H4V6z", "opacity" ".3"}) (e "path" #js {"d" "M20 18c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2H0v2h24v-2h-4zM4 6h16v10H4V6z"}))
                                      "LaptopTwoTone"))
