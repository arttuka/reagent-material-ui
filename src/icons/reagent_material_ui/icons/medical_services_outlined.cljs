(ns reagent-material-ui.icons.medical-services-outlined
  "Imports @material-ui/icons/MedicalServicesOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def medical-services-outlined (create-svg-icon [(e "path" #js {"d" "M20 6h-4V4c0-1.1-.9-2-2-2h-4c-1.1 0-2 .9-2 2v2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zM10 4h4v2h-4V4zm10 16H4V8h16v12z"}) (e "path" #js {"d" "M13 10h-2v3H8v2h3v3h2v-3h3v-2h-3z"})]
                                                "MedicalServicesOutlined"))
