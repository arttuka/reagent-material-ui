(ns reagent-material-ui.icons.edit-location-alt-rounded
  "Imports @material-ui/icons/EditLocationAltRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def edit-location-alt-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M13.54 13H10c-.55 0-1-.45-1-1V8.46c0-.26.11-.52.29-.7l5.32-5.32C13.78 2.16 12.9 2 12 2c-4.2 0-8 3.22-8 8.2 0 3.18 2.44 6.92 7.33 11.22.38.33.96.33 1.34 0C17.56 17.12 20 13.37 20 10.2c0-1.01-.16-1.94-.45-2.8l-5.31 5.31c-.18.18-.44.29-.7.29z"}) (e "path" #js {"d" "M11 11h2.12l6.16-6.16-2.12-2.12L11 8.88zm9.71-9L20 1.29a.9959.9959 0 0 0-1.41 0l-.72.72 2.12 2.12.72-.72c.39-.39.39-1.02 0-1.41z"}))
                                                "EditLocationAltRounded"))