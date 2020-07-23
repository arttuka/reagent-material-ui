(ns reagent-material-ui.icons.local-convenience-store-sharp
  "Imports @material-ui/icons/LocalConvenienceStoreSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-convenience-store-sharp (create-svg-icon (e "path" #js {"d" "M19 7V4H5v3H2v13h8v-4h4v4h8V7h-3zm-8 3H9v1h2v1H8V9h2V8H8V7h3v3zm5 2h-1v-2h-2V7h1v2h1V7h1v5z"})
                                                    "LocalConvenienceStoreSharp"))
