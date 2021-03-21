(ns reagent-material-ui.icons.devices-other-rounded
  "Imports @material-ui/icons/DevicesOtherRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def devices-other-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 6h15c.55 0 1-.45 1-1s-.45-1-1-1H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h2c.55 0 1-.45 1-1s-.45-1-1-1H4V6z"}) (e "path" #js {"d" "M13 13.78V13c0-.55-.45-1-1-1h-2c-.55 0-1 .45-1 1v.78c-.61.55-1 1.33-1 2.22s.39 1.67 1 2.22V19c0 .55.45 1 1 1h2c.55 0 1-.45 1-1v-.78c.61-.55 1-1.34 1-2.22s-.39-1.67-1-2.22zm-2 3.72c-.83 0-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5 1.5.67 1.5 1.5-.67 1.5-1.5 1.5zM21 9h-5c-.5 0-1 .5-1 1v9c0 .5.5 1 1 1h5c.5 0 1-.5 1-1v-9c0-.5-.5-1-1-1zm-1 9h-3v-7h3v7z"}))
                                            "DevicesOtherRounded"))
