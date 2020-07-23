(ns reagent-material-ui.icons.font-download-sharp
  "Imports @material-ui/icons/FontDownloadSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def font-download-sharp (create-svg-icon (e "path" #js {"d" "M9.93 13.5h4.14L12 7.98 9.93 13.5zM22 2H2v20h20V2zm-6.05 16.5l-1.14-3H9.17l-1.12 3H5.96l5.11-13h1.86l5.11 13h-2.09z"})
                                          "FontDownloadSharp"))
