(ns reagent-material-ui.icons.stroller
  "Imports @material-ui/icons/Stroller as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def stroller (create-svg-icon [(e "circle" #js {"cx" "16", "cy" "20", "r" "2"}) (e "circle" #js {"cx" "6", "cy" "20", "r" "2"}) (e "path" #js {"d" "M22 7v-.52C22 4.56 20.52 3 18.65 3c-1.66 0-2.54 1.27-3.18 2.03l-8.8 10.32C6.12 16 6.58 17 7.43 17H15c1.1 0 2-.9 2-2V6.27c.58-.68.97-1.27 1.65-1.27.77 0 1.35.66 1.35 1.48V7h2zm-7.7-2.9C13.03 3.4 11.56 3 10 3c-1.97 0-3.79.64-5.28 1.72l4.89 4.89L14.3 4.1z"})]
                               "Stroller"))
