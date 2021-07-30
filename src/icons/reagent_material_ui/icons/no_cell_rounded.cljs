(ns reagent-material-ui.icons.no-cell-rounded
  "Imports @material-ui/icons/NoCellRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def no-cell-rounded (create-svg-icon (e "path" #js {"d" "m8.83 6-3.7-3.7C5.42 1.55 6.15 1 7 1l10 .01c1.1 0 2 .89 2 1.99v13.17l-2-2V6H8.83zm11.66 15.9c-.39.39-1.02.39-1.41 0l-.2-.2c-.3.75-1.03 1.3-1.88 1.3H7c-1.1 0-2-.9-2-2V7.83l-2.9-2.9a.9959.9959 0 0 1 0-1.41c.39-.39 1.02-.39 1.41 0l16.97 16.97c.4.39.4 1.02.01 1.41zM15.17 18 7 9.83V18h8.17z"})
                                      "NoCellRounded"))
