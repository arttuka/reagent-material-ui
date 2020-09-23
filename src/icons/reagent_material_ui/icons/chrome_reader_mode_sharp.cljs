(ns reagent-material-ui.icons.chrome-reader-mode-sharp
  "Imports @material-ui/icons/ChromeReaderModeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def chrome-reader-mode-sharp (create-svg-icon (e "path" #js {"d" "M13 12h7v1.5h-7V12zm0-2.5h7V11h-7V9.5zm0 5h7V16h-7v-1.5zM23 4H1v17h22V4zm-2 15h-9V6h9v13z"})
                                               "ChromeReaderModeSharp"))
