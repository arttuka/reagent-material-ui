(ns reagent-material-ui.icons.no-cell-two-tone
  "Imports @material-ui/icons/NoCellTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def no-cell-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 21h10v-1H7v1zM7 3v1h10V3H7z", "opacity" ".3"}) (e "path" #js {"d" "M17 6v8.17l2 2V3c0-1.1-.9-1.99-2-1.99L7 1c-.85 0-1.58.55-1.87 1.3L8.83 6H17zM7 3h10v1H7V3zm14.19 18.19L2.81 2.81 1.39 4.22 5 7.83V21c0 1.1.9 2 2 2h10c.85 0 1.58-.55 1.87-1.3l.91.91 1.41-1.42zM17 21H7v-1h10v1zM7 18V9.83L15.17 18H7z"}))
                                       "NoCellTwoTone"))
