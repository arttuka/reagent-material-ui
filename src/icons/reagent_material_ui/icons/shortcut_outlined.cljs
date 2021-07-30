(ns reagent-material-ui.icons.shortcut-outlined
  "Imports @material-ui/icons/ShortcutOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def shortcut-outlined (create-svg-icon (e "path" #js {"d" "m15 5-1.41 1.41L15 7.83 17.17 10H8c-2.76 0-5 2.24-5 5v4h2v-4c0-1.65 1.35-3 3-3h9.17L15 14.17l-1.41 1.41L15 17l6-6-6-6z"})
                                        "ShortcutOutlined"))
