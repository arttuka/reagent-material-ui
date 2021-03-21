(ns reagent-material-ui.icons.g-mobiledata-sharp
  "Imports @material-ui/icons/GMobiledataSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def g-mobiledata-sharp (create-svg-icon (e "path" #js {"d" "M12 11v2h2v2H9V9h7V7H7v10h9v-6h-4z"})
                                         "GMobiledataSharp"))
