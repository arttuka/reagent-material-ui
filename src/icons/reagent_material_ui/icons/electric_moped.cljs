(ns reagent-material-ui.icons.electric-moped
  "Imports @material-ui/icons/ElectricMoped as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def electric-moped (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 5c0-1.1-.9-2-2-2h-3v2h3v2.65L13.52 12H10V7H6c-2.21 0-4 1.79-4 4v3h2c0 1.66 1.34 3 3 3s3-1.34 3-3h4.48L19 8.35V5zM7 15c-.55 0-1-.45-1-1h2c0 .55-.45 1-1 1z"}) (e "path" #js {"d" "M5 4h5v2H5zm14 7c-1.66 0-3 1.34-3 3s1.34 3 3 3 3-1.34 3-3-1.34-3-3-3zm0 4c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zM7 20h4v-2l6 3h-4v2z"}))
                                     "ElectricMoped"))
