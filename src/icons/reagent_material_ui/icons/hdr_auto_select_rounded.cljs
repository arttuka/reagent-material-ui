(ns reagent-material-ui.icons.hdr-auto-select-rounded
  "Imports @material-ui/icons/HdrAutoSelectRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def hdr-auto-select-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M10 16H7.25c-.41 0-.75.34-.75.75v4.5c0 .41.34.75.75.75H10c.83 0 1.5-.67 1.5-1.5v-3c0-.83-.67-1.5-1.5-1.5zm0 4.5H8v-3h2v3zM4.25 16c-.41 0-.75.34-.75.75V18h-2v-1.25c0-.41-.34-.75-.75-.75s-.75.34-.75.75v4.5c0 .41.34.75.75.75s.75-.34.75-.75V19.5h2v1.75c0 .41.34.75.75.75s.75-.34.75-.75v-4.5c0-.41-.34-.75-.75-.75zm19 2.5H22v-1.25c0-.41-.34-.75-.75-.75s-.75.34-.75.75v1.25h-1.25c-.41 0-.75.34-.75.75s.34.75.75.75h1.25v1.25c0 .41.34.75.75.75s.75-.34.75-.75V20h1.25c.41 0 .75-.34.75-.75s-.34-.75-.75-.75zM16.5 16h-2.75c-.41 0-.75.34-.75.75v4.56c0 .38.31.69.69.69h.11c.38 0 .69-.31.69-.69V20h1.1l.72 1.59c.11.25.36.41.63.41.5 0 .83-.51.64-.97l-.48-1.13c.5-.3.9-.8.9-1.4v-1c0-.83-.67-1.5-1.5-1.5zm0 2.5h-2v-1h2v1zM11.97 5.3l-1.02 2.89h2.1L12.03 5.3z"}) (e "path" #js {"d" "M12 2C8.69 2 6 4.69 6 8s2.69 6 6 6 6-2.69 6-6-2.69-6-6-6zm2.44 9c-.24 0-.45-.15-.53-.38l-.49-1.41h-2.83l-.5 1.41c-.08.23-.29.38-.53.38-.39 0-.67-.39-.53-.76l2.12-5.65c.14-.36.47-.59.85-.59s.71.23.85.59l2.12 5.65c.14.37-.13.76-.53.76z"}))
                                              "HdrAutoSelectRounded"))
