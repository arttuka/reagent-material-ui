(ns reagent-material-ui.icons.lunch-dining-sharp
  "Imports @material-ui/icons/LunchDiningSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def lunch-dining-sharp (create-svg-icon (e "path" #js {"d" "M2 16h20v5H2zm16.66-4.5c-1.95 0-2.09 1-3.33 1-1.19 0-1.42-1-3.33-1-1.95 0-2.09 1-3.33 1-1.19 0-1.42-1-3.33-1-1.95 0-2.09 1-3.33 1v2c1.9 0 2.17-1 3.35-1 1.19 0 1.42 1 3.33 1 1.95 0 2.09-1 3.33-1 1.19 0 1.42 1 3.33 1 1.95 0 2.09-1 3.33-1 1.19 0 1.4.98 3.32 1l-.01-1.98c-1.61-.33-1.62-1.02-3.33-1.02zM22 9c.02-4-4.28-6-10-6C6.29 3 2 5 2 9v1h20V9z"})
                                         "LunchDiningSharp"))
