(ns reagent-material-ui.icons.local-see-sharp
  "Imports @material-ui/icons/LocalSeeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def local-see-sharp (create-svg-icon [(e "circle" #js {"cx" "12", "cy" "12", "r" "3.2"}) (e "path" #js {"d" "M22 4h-5.17L15 2H9L7.17 4H2v16h20V4zM12 17c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z"})]
                                      "LocalSeeSharp"))
