(ns reagent-material-ui.icons.repeat-one-on-outlined
  "Imports @material-ui/icons/RepeatOneOnOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def repeat-one-on-outlined (create-svg-icon (e "path" #js {"d" "M21 1H3c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm-2 18H6.83l1.58 1.58L7 22l-4-4 4-4 1.41 1.42L6.83 17H17v-4h2v6zm-9-8.5V9h3v6h-1.5v-4.5H10zm7-.5l-1.41-1.42L17.17 7H7v4H5V5h12.17l-1.58-1.58L17 2l4 4-4 4z"})
                                             "RepeatOneOnOutlined"))
