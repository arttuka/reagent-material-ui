(ns reagent-material-ui.icons.medical-services-sharp
  "Imports @material-ui/icons/MedicalServicesSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def medical-services-sharp (create-svg-icon (e "path" #js {"d" "M16 6V2H8v4H2v16h20V6h-6zm-6-2h4v2h-4V4zm6 11h-3v3h-2v-3H8v-2h3v-3h2v3h3v2z"})
                                             "MedicalServicesSharp"))
