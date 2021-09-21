(ns reagent-mui.icons.medical-services-two-tone
  "Imports @mui/icons-material/MedicalServicesTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def medical-services-two-tone (create-svg-icon [(e "path" #js {"d" "M4 20h16V8H4v12zm4-7h3v-3h2v3h3v2h-3v3h-2v-3H8v-2z", "opacity" ".3"}) (e "path" #js {"d" "M20 6h-4V4c0-1.1-.9-2-2-2h-4c-1.1 0-2 .9-2 2v2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zM10 4h4v2h-4V4zm10 16H4V8h16v12z"}) (e "path" #js {"d" "M11 18h2v-3h3v-2h-3v-3h-2v3H8v2h3z"})]
                                                "MedicalServicesTwoTone"))
