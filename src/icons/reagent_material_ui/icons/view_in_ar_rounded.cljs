(ns reagent-material-ui.icons.view-in-ar-rounded
  "Imports @material-ui/icons/ViewInArRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-in-ar-rounded (create-svg-icon (e "path" #js {"d" "M2 6c.55 0 1-.45 1-1V4c0-.55.45-1 1-1h1c.55 0 1-.45 1-1s-.45-1-1-1H4C2.34 1 1 2.34 1 4v1c0 .55.45 1 1 1zm3 15H4c-.55 0-1-.45-1-1v-1c0-.55-.45-1-1-1s-1 .45-1 1v1c0 1.66 1.34 3 3 3h1c.55 0 1-.45 1-1s-.45-1-1-1zM20 1h-1c-.55 0-1 .45-1 1s.45 1 1 1h1c.55 0 1 .45 1 1v1c0 .55.45 1 1 1s1-.45 1-1V4c0-1.66-1.34-3-3-3zm2 17c-.55 0-1 .45-1 1v1c0 .55-.45 1-1 1h-1c-.55 0-1 .45-1 1s.45 1 1 1h1c1.66 0 3-1.34 3-3v-1c0-.55-.45-1-1-1zm-3-3.13V9.13c0-.72-.38-1.38-1-1.73l-5-2.88c-.31-.18-.65-.27-1-.27s-.69.09-1 .27L6 7.39c-.62.36-1 1.02-1 1.74v5.74c0 .72.38 1.38 1 1.73l5 2.88c.31.18.65.27 1 .27s.69-.09 1-.27l5-2.88c.62-.35 1-1.01 1-1.73zm-8 2.3-4-2.3v-4.63l4 2.33v4.6zm1-6.33L8.04 8.53 12 6.25l3.96 2.28L12 10.84zm5 4.03-4 2.3v-4.6l4-2.33v4.63z"})
                                         "ViewInArRounded"))
