(ns reagent-material-ui.icons.add-business-sharp
  "Imports @material-ui/icons/AddBusinessSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def add-business-sharp (create-svg-icon [(e "path" #js {"d" "M15 17h2v-3h1v-2l-1-5H2l-1 5v2h1v6h9v-6h4v3zm-6 1H4v-4h5v4zM2 4h15v2H2z"}) (e "path" #js {"d" "M20 18v-3h-2v3h-3v2h3v3h2v-3h3v-2z"})]
                                         "AddBusinessSharp"))
