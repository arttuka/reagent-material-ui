(ns reagent-material-ui.icons.edit-location-rounded
  "Imports @material-ui/icons/EditLocationRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def edit-location-rounded (create-svg-icon (e "path" #js {"d" "M12 2c-4.2 0-8 3.22-8 8.2 0 3.18 2.45 6.92 7.34 11.23.38.33.95.33 1.33 0C17.55 17.12 20 13.38 20 10.2 20 5.22 16.2 2 12 2zM9.73 13.5H8.5v-1.44l3.93-3.92 1.43 1.43-3.77 3.78c-.1.1-.22.15-.36.15zm5.55-5.34l-.7.7-1.44-1.44.7-.7c.15-.15.39-.15.54 0l.9.9c.15.15.15.39 0 .54z"})
                                            "EditLocationRounded"))
