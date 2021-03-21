(ns reagent-material-ui.icons.format-paint-two-tone
  "Imports @material-ui/icons/FormatPaintTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-paint-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M6 4h10v2H6z", "opacity" ".3"}) (e "path" #js {"d" "M17 2H5c-.55 0-1 .45-1 1v4c0 .55.45 1 1 1h12c.55 0 1-.45 1-1V6h1v4H9v11c0 .55.45 1 1 1h2c.55 0 1-.45 1-1v-9h8V4h-3V3c0-.55-.45-1-1-1zm-1 4H6V4h10v2z"}))
                                            "FormatPaintTwoTone"))
