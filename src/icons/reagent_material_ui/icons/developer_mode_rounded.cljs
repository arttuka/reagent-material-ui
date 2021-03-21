(ns reagent-material-ui.icons.developer-mode-rounded
  "Imports @material-ui/icons/DeveloperModeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def developer-mode-rounded (create-svg-icon (e "path" #js {"d" "M7 6h10c0 .55.45 1 1 1s1-.45 1-1V3c0-1.1-.9-1.99-2-1.99L7 1c-1.1 0-2 .9-2 2v3c0 .55.45 1 1 1s1-.45 1-1zm9.12 9.88l3.17-3.17c.39-.39.39-1.02 0-1.41l-3.17-3.17c-.39-.39-1.03-.39-1.42 0-.39.39-.39 1.02 0 1.41L17.17 12l-2.47 2.47c-.39.39-.39 1.02 0 1.41.39.39 1.03.39 1.42 0zm-6.83-1.42L6.83 12l2.46-2.46c.39-.39.39-1.02 0-1.41-.39-.39-1.03-.39-1.42 0L4.7 11.3c-.39.39-.39 1.02 0 1.41l3.17 3.17c.39.39 1.03.39 1.42 0 .4-.39.39-1.03 0-1.42zM17 18H7c0-.55-.45-1-1-1s-1 .45-1 1v3c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2v-3c0-.55-.45-1-1-1s-1 .45-1 1z"})
                                             "DeveloperModeRounded"))
