(ns reagent-material-ui.icons.extension-off-sharp
  "Imports @material-ui/icons/ExtensionOffSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def extension-off-sharp (create-svg-icon (e "path" #js {"d" "M19.78 22.61l-1.63-1.63c-.05 0-.1.02-.15.02h-3.8c0-2.71-2.16-3-2.7-3s-2.7.29-2.7 3H3v-5.8c2.71 0 3-2.16 3-2.7s-.3-2.7-2.99-2.7V6c0-.05.02-.09.02-.14L1.39 4.22 2.8 2.81l18.38 18.38-1.4 1.42zm.22-5.44V15c1.38 0 2.5-1.12 2.5-2.5S21.38 10 20 10V4h-6c0-1.38-1.12-2.5-2.5-2.5S9 2.62 9 4H6.83L20 17.17z"})
                                          "ExtensionOffSharp"))
