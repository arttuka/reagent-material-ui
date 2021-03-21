(ns reagent-material-ui.icons.twenty-four-mp-rounded
  "Imports @material-ui/icons/TwentyFourMpRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def twenty-four-mp-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM6.5 9c0-.55.45-1 1-1h2V7H7.25c-.41 0-.75-.34-.75-.75s.34-.75.75-.75H10c.55 0 1 .45 1 1V8c0 .55-.45 1-1 1H8v1h2.25c.41 0 .75.34.75.75s-.34.75-.75.75H7.5c-.55 0-1-.45-1-1V9zm6 8.75c0 .41-.34.75-.75.75s-.75-.34-.75-.75V14h-1v2.25c0 .41-.34.75-.75.75s-.75-.34-.75-.75V14h-1v3.75c0 .41-.34.75-.75.75S6 18.16 6 17.75V13.5c0-.55.45-1 1-1h4.5c.55 0 1 .45 1 1v4.25zM18 16c0 .55-.45 1-1 1h-2v.75c0 .41-.34.75-.75.75s-.75-.34-.75-.75V13.5c0-.55.45-1 1-1H17c.55 0 1 .45 1 1V16zm-.25-6h-.25v.75c0 .41-.34.75-.75.75s-.75-.34-.75-.75V10h-2c-.55 0-1-.45-1-1V6.25c0-.41.34-.75.75-.75s.75.34.75.75V8.5H16V6.25c0-.41.34-.75.75-.75s.75.34.75.75V8.5h.25c.41 0 .75.34.75.75s-.34.75-.75.75z"}) (e "path" #js {"d" "M15 14h1.5v1.5H15z"}))
                                             "TwentyFourMpRounded"))