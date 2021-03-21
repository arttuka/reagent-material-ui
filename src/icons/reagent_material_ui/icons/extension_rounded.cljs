(ns reagent-material-ui.icons.extension-rounded
  "Imports @material-ui/icons/ExtensionRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def extension-rounded (create-svg-icon (e "path" #js {"d" "M11.5 1.5C10.12 1.5 9 2.62 9 4H5.01c-1.1 0-2 .9-2 2v3.8C5.7 9.8 6 11.96 6 12.5s-.29 2.7-3 2.7V19c0 1.1.9 2 2 2h3.8c0-2.71 2.16-3 2.7-3s2.7.29 2.7 3H18c1.1 0 2-.9 2-2v-4c1.38 0 2.5-1.12 2.5-2.5S21.38 10 20 10V6c0-1.1-.9-2-2-2h-4c0-1.38-1.12-2.5-2.5-2.5z"})
                                        "ExtensionRounded"))
