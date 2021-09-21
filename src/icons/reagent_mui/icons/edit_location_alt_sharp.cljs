(ns reagent-mui.icons.edit-location-alt-sharp
  "Imports @mui/icons-material/EditLocationAltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def edit-location-alt-sharp (create-svg-icon (e "path" #js {"d" "M13.95 13H9V8.05l5.61-5.61C13.78 2.16 12.9 2 12 2c-4.2 0-8 3.22-8 8.2 0 3.32 2.67 7.25 8 11.8 5.33-4.55 8-8.48 8-11.8 0-1.01-.16-1.94-.45-2.8l-5.6 5.6zM11 11h2.12l6.16-6.16-2.12-2.12L11 8.88V11zM19.29.59l-1.42 1.42 2.12 2.12 1.42-1.42L19.29.59z"})
                                              "EditLocationAltSharp"))
