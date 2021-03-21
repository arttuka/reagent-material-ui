(ns reagent-material-ui.icons.schema-sharp
  "Imports @material-ui/icons/SchemaSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def schema-sharp (create-svg-icon (e "path" #js {"d" "M14 9v2h-3V9H8.5V7H11V1H4v6h2.5v2H4v6h2.5v2H4v6h7v-6H8.5v-2H11v-2h3v2h7V9h-7z"})
                                   "SchemaSharp"))
