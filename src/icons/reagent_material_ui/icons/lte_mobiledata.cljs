(ns reagent-material-ui.icons.lte-mobiledata
  "Imports @material-ui/icons/LteMobiledata as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def lte-mobiledata (create-svg-icon (e "path" #js {"d" "M6 14h3v2H4V8h2v6zm3-4h2v6h2v-6h2V8H9v2zm12 0V8h-5v8h5v-2h-3v-1h3v-2h-3v-1h3z"})
                                     "LteMobiledata"))
