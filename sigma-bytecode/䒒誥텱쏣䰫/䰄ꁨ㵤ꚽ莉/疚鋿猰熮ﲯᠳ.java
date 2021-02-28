public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u759a\u92ff\u7330\u71ae\ufcaf\u1833 {
    public void \u759a\u92ff\u7330\u71ae\ufcaf\u1833(java.lang.String p0, java.io.File p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833)
            putfield:File(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\ub1b9\u759a\u839e\u6b0d\u7873\u3504, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833, p1:File)
            putfield:ZipFile(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u836c\uf9c5\u3c25\u9a18\u8df4\u6198, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833, aconstnull:ZipFile())
            putfield:String(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\ua068\u8aa5\uc910\ubb2b\ufcaf\ua562, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833, loadelement:String(getstatic:String[](\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u600f\ua3b4\u71ae\u6c52\u8308\ud51e), and:int(ldc:int(-8393), ldc:int(8392))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud217\u6b0d\u12cb\u6b0d\u74b1\ub32d() {
        var_1_152 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_152 = and:int(ldc:int(-1766090211), ldc:int(1457150805))
            
            loop {
                Label_0096:
                
                if (cmpne:boolean(and:int(var_1_152:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0290)
                }
                
                if (cmpne:boolean(and:int(var_1_152:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0233)
                }
                
                if (cmpeq:boolean(and:int(var_1_152:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0185)
                }
                
                if (cmpeq:boolean(and:int(var_1_152:int, ldc:int(64)), ldc:int(0))) {
                    var_1_152 = and:int(var_1_152:int, ldc:int(1608481459))
                    
                    if (cmpeq:boolean(getfield:ZipFile(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u836c\uf9c5\u3c25\u9a18\u8df4\u6198, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833), aconstnull:ZipFile())) {
                        looporswitchbreak()
                    }
                }
                
                Label_0136:
                
                if (cmpne:boolean(and:int(var_1_152:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_152 = and:int(var_1_152:int, ldc:int(444988462))
                    goto(Label_0290)
                }
                
                if (cmpeq:boolean(and:int(var_1_152:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0233)
                }
                
                if (cmpeq:boolean(and:int(var_1_152:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_152:int, ldc:int(1)), ldc:int(0))) {
                        var_1_152 = and:int(var_1_152:int, ldc:int(2100152569))
                        loopcontinue()
                    }
                    
                    var_1_152 = and:int(var_1_152:int, ldc:int(-96502021))
                }
                
                try {
                    Label_0185:
                    
                    while (cmpne:boolean(and:int(var_1_152:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_152:int, ldc:int(268435456)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_1_152:int, ldc:int(64)), ldc:int(0))) {
                                goto(Label_0136)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_152:int, ldc:int(1073741824)), ldc:int(0))) {
                                loopcontinue(Label_0096)
                            }
                            
                            var_1_152 = and:int(var_1_152:int, ldc:int(1952185099))
                            invokevirtual:void(ZipFile::close, getfield:ZipFile(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u836c\uf9c5\u3c25\u9a18\u8df4\u6198, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833))
                        }
                        
                        Label_0233:
                        
                        if (cmpeq:boolean(and:int(var_1_152:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0290)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_152:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        if (cmpne:boolean(and:int(var_1_152:int, ldc:int(4194304)), ldc:int(0))) {
                            var_1_152 = and:int(var_1_152:int, ldc:int(-675772601))
                            goto(Label_0136)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_152:int, ldc:int(536870912)), ldc:int(0))) {
                            var_1_152 = and:int(var_1_152:int, ldc:int(1830163699))
                            loopcontinue(Label_0096)
                        }
                        
                        var_1_152 = and:int(var_1_152:int, ldc:int(-1841324259))
                        goto(Label_0290)
                    }
                    
                    var_1_152 = and:int(var_1_152:int, ldc:int(-533499977))
                }
                catch (java.lang.Exception stack_121_0) {
                }
                
                Label_0290:
                
                if (cmpeq:boolean(and:int(var_1_152:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_152 = and:int(var_1_152:int, ldc:int(294491447))
                    goto(Label_0233)
                }
                
                if (cmpeq:boolean(and:int(var_1_152:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_152 = and:int(var_1_152:int, ldc:int(1635717787))
                    goto(Label_0185)
                }
                
                if (cmpne:boolean(and:int(var_1_152:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0136)
                }
                
                if (cmpeq:boolean(and:int(var_1_152:int, ldc:int(64)), ldc:int(0))) {
                    var_1_152 = and:int(var_1_152:int, ldc:int(1906235387))
                    putfield:ZipFile(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u836c\uf9c5\u3c25\u9a18\u8df4\u6198, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833, aconstnull:ZipFile())
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.io.InputStream \ud4fe\u3bc9\u71ae\u0800\u6bb9\ud171(java.lang.String p0) {
        var_2_266 : int
        var_4_17E : String
        var_5_240 : ZipEntry
        stack_278_0 : InputStream [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_266 = and:int(ldc:int(-1476591730), ldc:int(-1214297297))
        
        try {
            loop {
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(512)), ldc:int(0))) {
                    var_2_266 = and:int(var_2_266:int, ldc:int(-2064294709))
                    goto(Label_0318)
                }
                
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0265)
                }
                
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0193)
                }
                
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(8)), ldc:int(0))) {
                    var_2_266 = and:int(var_2_266:int, ldc:int(-126741462))
                }
                else {
                    var_2_266 = and:int(var_2_266:int, ldc:int(1941953182))
                    
                    if (cmpne:boolean(getfield:ZipFile(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u836c\uf9c5\u3c25\u9a18\u8df4\u6198, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833), aconstnull:ZipFile())) {
                        goto(Label_0318)
                    }
                }
                
                Label_0152:
                
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0318)
                }
                
                if (cmpne:boolean(and:int(var_2_266:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0265)
                }
                
                if (cmpne:boolean(and:int(var_2_266:int, ldc:int(32)), ldc:int(0))) {
                    var_2_266 = and:int(var_2_266:int, ldc:int(571707115))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_266 = and:int(var_2_266:int, ldc:int(-872632545))
                }
                
                Label_0193:
                
                if (cmpne:boolean(and:int(var_2_266:int, ldc:int(16)), ldc:int(0))) {
                    var_2_266 = and:int(var_2_266:int, ldc:int(-68660324))
                    goto(Label_0318)
                }
                
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_266 = and:int(var_2_266:int, ldc:int(-932793622))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_266 = and:int(var_2_266:int, ldc:int(-1857321536))
                        loopcontinue()
                    }
                    
                    var_2_266 = and:int(var_2_266:int, ldc:int(199227373))
                    putfield:ZipFile(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u836c\uf9c5\u3c25\u9a18\u8df4\u6198, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833, initobject:ZipFile(ZipFile::<init>, getfield:File(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\ub1b9\u759a\u839e\u6b0d\u7873\u3504, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833)))
                }
                
                Label_0265:
                
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_266 = and:int(var_2_266:int, ldc:int(-590817566))
                        goto(Label_0193)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_266 = and:int(var_2_266:int, ldc:int(733843150))
                    putfield:String(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\ua068\u8aa5\uc910\ubb2b\ufcaf\ua562, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833, invokespecial:String(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u3711\u52d3\u927d\u5654\u74b1\u183a, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833, getfield:ZipFile(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u836c\uf9c5\u3c25\u9a18\u8df4\u6198, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833)))
                }
                
                Label_0318:
                
                if (cmpne:boolean(and:int(var_2_266:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0265)
                }
                
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0193)
                }
                
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_266 = and:int(var_2_266:int, ldc:int(-229537980))
                    goto(Label_0152)
                }
                
                if (cmpne:boolean(and:int(var_2_266:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_266 = and:int(var_2_266:int, ldc:int(-2009195792))
            }
            
            var_2_266 = and:int(var_2_266:int, ldc:int(-203520484))
            var_4_17E = invokestatic:String(\ud7e8\ua3b4\uc9f6\u56bd\u2dcc\u718f::\u8d90\u1833\u0b8e\u8cae\u5140\u8640, p0:String, loadelement:String(getstatic:String[](\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u600f\ua3b4\u71ae\u6c52\u8308\ud51e), and:int(ldc:int(16609), ldc:int(1553))))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_266 = and:int(var_2_266:int, ldc:int(-1227206828))
                    goto(Label_0513)
                }
                
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_266 = and:int(var_2_266:int, ldc:int(-158846418))
                    goto(Label_0471)
                }
                
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(32)), ldc:int(0))) {
                    var_2_266 = and:int(var_2_266:int, ldc:int(-138636707))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(String::contains, var_4_17E:String, loadelement:String[expected:CharSequence](getstatic:String[](\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u600f\ua3b4\u71ae\u6c52\u8308\ud51e), and:int(ldc:int(2850), ldc:int(24579)))))) {
                        goto(Label_0513)
                    }
                }
                
                Label_0445:
                
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0513)
                }
                
                if (cmpne:boolean(and:int(var_2_266:int, ldc:int(33554432)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_266 = and:int(var_2_266:int, ldc:int(-476295668))
                }
                
                Label_0471:
                
                if (cmpne:boolean(and:int(var_2_266:int, ldc:int(8)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_266 = and:int(var_2_266:int, ldc:int(619536218))
                        goto(Label_0445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_266 = and:int(var_2_266:int, ldc:int(-1950360019))
                    var_4_17E = invokespecial:String(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u5d20\u9937\u4ab3\u156b\u93a2\uc910, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833, var_4_17E:String)
                }
                
                Label_0513:
                
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0471)
                }
                
                if (cmpne:boolean(and:int(var_2_266:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0445)
                }
                
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(1)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_266 = and:int(var_2_266:int, ldc:int(1901930506))
            }
            
            var_2_266 = and:int(var_2_266:int, ldc:int(1472014894))
            var_5_240 = invokevirtual:ZipEntry(ZipFile::getEntry, getfield:ZipFile(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u836c\uf9c5\u3c25\u9a18\u8df4\u6198, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\ua068\u8aa5\uc910\ubb2b\ufcaf\ua562, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833)), var_4_17E:String)))
            
            do {
                if (cmpeq:boolean(and:int(var_2_266:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_266 = and:int(var_2_266:int, ldc:int(-994165619))
                }
                else {
                    var_2_266 = and:int(var_2_266:int, ldc:int(1067198060))
                    
                    if (cmpeq:boolean(var_5_240:ZipEntry, aconstnull:ZipEntry())) {
                        loopcontinue()
                    }
                    
                    stack_278_0 = invokevirtual:InputStream(ZipFile::getInputStream, getfield:ZipFile(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u836c\uf9c5\u3c25\u9a18\u8df4\u6198, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833), var_5_240:ZipEntry)
                    return:InputStream(stack_278_0:InputStream)
                }
            } while (cmpne:boolean(and:int(var_2_266:int, ldc:int(16)), ldc:int(0)))
            
            var_2_266 = and:int(var_2_266:int, ldc:int(1811713596))
            stack_278_0 = aconstnull:InputStream()
            return:InputStream(stack_278_0:InputStream)
        }
        catch (java.lang.Exception var_4_27D) {
            return:InputStream(aconstnull:InputStream())
        }
    }
    
    private java.lang.String \u5d20\u9937\u4ab3\u156b\u93a2\uc910(java.lang.String p0) {
        var_2_5F : int
        var_4_67 : ArrayDeque<String>
        var_5_78 : String[]
        var_6_81 : int
        var_7_A9 : String
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_5F = and:int(ldc:int(-2104677553), ldc:int(212675327))
        var_4_67 = initobject:ArrayDeque<Object>[expected:Deque<Object>](ArrayDeque<E>::<init>)
        var_5_78 = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, p0:String, loadelement:String(getstatic:String[](\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u600f\ua3b4\u71ae\u6c52\u8308\ud51e), and:int(ldc:int(12327), ldc:int(18841))))
        var_6_81 = and:int(ldc:int(13498), ldc:int(-29883))
        
        loop {
            var_2_5F = and:int(var_2_5F:int, ldc:int(685587439))
            
            if (cmpge:boolean(var_6_81:int, arraylength:int(var_5_78:String[]))) {
                return:String(invokevirtual:String(Joiner::join, invokestatic:Joiner(Joiner::on, ldc:char(47)), var_4_67:Deque<Object>[expected:Iterable]))
            }
            
            var_7_A9 = loadelement:String(var_5_78:String[], var_6_81:int)
            
            if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_7_A9:String, loadelement:String[expected:Object](getstatic:String[](\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u600f\ua3b4\u71ae\u6c52\u8308\ud51e), xor:int(ldc:int(-32763), ldc:int(-32761)))))) {
                invokeinterface:boolean(Deque<String>::add, var_4_67:ArrayDeque<String>[expected:Deque<String>], var_7_A9:String)
            }
            else {
                if (invokeinterface:boolean(Collection<E>::isEmpty, var_4_67:Deque<Object>)) {
                    return:String(loadelement:String(getstatic:String[](\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u600f\ua3b4\u71ae\u6c52\u8308\ud51e), and:int(ldc:int(16507), ldc:int(-18556))))
                }
                
                invokeinterface:Object(Deque<Object>::removeLast, var_4_67:Deque<Object>)
            }
            
            inc:int(var_6_81, ldc:int(1))
        }
    }
    
    private java.lang.String \u3711\u52d3\u927d\u5654\u74b1\u183a(java.util.zip.ZipFile p0) {
        var_2_5F : int
        var_4_6F : ZipEntry
        var_2_7A : int
        var_5_89 : Pattern
        var_6_8F : Enumeration<? extends ZipEntry>
        var_9_F3 : Matcher
        var_10_116 : String
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_5F = and:int(ldc:int(-1324370959), ldc:int(1917826868))
        var_4_6F = invokevirtual:ZipEntry(ZipFile::getEntry, p0:ZipFile, loadelement:String(getstatic:String[](\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u600f\ua3b4\u71ae\u6c52\u8308\ud51e), and:int(ldc:int(17067), ldc:int(6211))))
        
        if (logicaland:boolean(cmpne:boolean(var_4_6F:ZipEntry, aconstnull:ZipEntry()), invokevirtual:boolean(ZipEntry::isDirectory, var_4_6F:ZipEntry))) {
            return:String(loadelement:String(getstatic:String[](\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u600f\ua3b4\u71ae\u6c52\u8308\ud51e), and:int(ldc:int(28166), ldc:int(-28319))))
        }
        
        var_2_7A = and:int(var_2_5F:int, ldc:int(970699577))
        var_5_89 = invokestatic:Pattern(Pattern::compile, loadelement:String(getstatic:String[](\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u600f\ua3b4\u71ae\u6c52\u8308\ud51e), xor:int(ldc:int(12330), ldc:int(12334))))
        var_6_8F = invokevirtual:Enumeration<? extends ZipEntry>(ZipFile::entries, p0:ZipFile)
        
        while (invokeinterface:boolean(Enumeration::hasMoreElements, var_6_8F:Enumeration<? extends ZipEntry>)) {
            var_9_F3 = invokevirtual:Matcher(Pattern::matcher, var_5_89:Pattern, invokevirtual:String[expected:CharSequence](ZipEntry::getName, checkcast:ZipEntry(java.util.zip.ZipEntry.class, invokeinterface:? extends ZipEntry[expected:ZipEntry](Enumeration<? extends ZipEntry>::nextElement, var_6_8F:Enumeration<? extends ZipEntry>))))
            
            if (invokevirtual:boolean(Matcher::matches, var_9_F3:Matcher)) {
                var_10_116 = invokevirtual:String(Matcher::group, var_9_F3:Matcher, xor:int(ldc:int(75), ldc:int(74)))
                
                if (cmpne:boolean(var_10_116:String, aconstnull:String())) {
                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_10_116:String, loadelement:String[expected:Object](getstatic:String[](\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u600f\ua3b4\u71ae\u6c52\u8308\ud51e), and:int(ldc:int(563), ldc:int(21511)))))) {
                        return:String(var_10_116:String)
                    }
                    
                    return:String(loadelement:String(getstatic:String[](\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u600f\ua3b4\u71ae\u6c52\u8308\ud51e), and:int(ldc:int(9280), ldc:int(-9281))))
                }
            }
            
            var_2_7A = and:int(var_2_7A:int, ldc:int(845126586))
        }
        
        return:String(loadelement:String(getstatic:String[](\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u600f\ua3b4\u71ae\u6c52\u8308\ud51e), and:int(ldc:int(-12823), ldc:int(12822))))
    }
    
    public boolean \u4e72\u3711\ub19c\u600f\u6b5f\u3dd3(java.lang.String p0) {
        var_2_190 : int
        var_4_1A0 : String
        var_5_1C5 : ZipEntry
        stack_20A_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_190 = and:int(ldc:int(-2130559143), ldc:int(-300057321))
        
        try {
            loop {
                if (cmpne:boolean(and:int(var_2_190:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_190 = and:int(var_2_190:int, ldc:int(713849908))
                    goto(Label_0337)
                }
                
                if (cmpeq:boolean(and:int(var_2_190:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0281)
                }
                
                if (cmpeq:boolean(and:int(var_2_190:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0213)
                }
                
                if (cmpeq:boolean(and:int(var_2_190:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_190 = and:int(var_2_190:int, ldc:int(1147962731))
                }
                else {
                    var_2_190 = and:int(var_2_190:int, ldc:int(-612664037))
                    
                    if (cmpne:boolean(getfield:ZipFile(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u836c\uf9c5\u3c25\u9a18\u8df4\u6198, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833), aconstnull:ZipFile())) {
                        goto(Label_0337)
                    }
                }
                
                Label_0159:
                
                if (cmpeq:boolean(and:int(var_2_190:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0337)
                }
                
                if (cmpeq:boolean(and:int(var_2_190:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0281)
                }
                
                if (cmpne:boolean(and:int(var_2_190:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_190 = and:int(var_2_190:int, ldc:int(-1756433427))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_190:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_190 = and:int(var_2_190:int, ldc:int(610101893))
                        loopcontinue()
                    }
                    
                    var_2_190 = and:int(var_2_190:int, ldc:int(1445246837))
                }
                
                Label_0213:
                
                if (cmpne:boolean(and:int(var_2_190:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0337)
                }
                
                if (cmpne:boolean(and:int(var_2_190:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_190 = and:int(var_2_190:int, ldc:int(-1768837422))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_190:int, ldc:int(4096)), ldc:int(0))) {
                        var_2_190 = and:int(var_2_190:int, ldc:int(329681741))
                        goto(Label_0159)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_190:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_190 = and:int(var_2_190:int, ldc:int(1607417303))
                    putfield:ZipFile(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u836c\uf9c5\u3c25\u9a18\u8df4\u6198, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833, initobject:ZipFile(ZipFile::<init>, getfield:File(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\ub1b9\u759a\u839e\u6b0d\u7873\u3504, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833)))
                }
                
                Label_0281:
                
                if (cmpne:boolean(and:int(var_2_190:int, ldc:int(256)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_190:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0213)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_190:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0159)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_190:int, ldc:int(4096)), ldc:int(0))) {
                        var_2_190 = and:int(var_2_190:int, ldc:int(-567977610))
                        loopcontinue()
                    }
                    
                    var_2_190 = and:int(var_2_190:int, ldc:int(-1030291553))
                    putfield:String(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\ua068\u8aa5\uc910\ubb2b\ufcaf\ua562, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833, invokespecial:String(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u3711\u52d3\u927d\u5654\u74b1\u183a, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833, getfield:ZipFile(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u836c\uf9c5\u3c25\u9a18\u8df4\u6198, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833)))
                }
                
                Label_0337:
                
                if (cmpne:boolean(and:int(var_2_190:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0281)
                }
                
                if (cmpne:boolean(and:int(var_2_190:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_190 = and:int(var_2_190:int, ldc:int(1977931446))
                    goto(Label_0213)
                }
                
                if (cmpeq:boolean(and:int(var_2_190:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_190 = and:int(var_2_190:int, ldc:int(-98657825))
                    goto(Label_0159)
                }
                
                if (cmpeq:boolean(and:int(var_2_190:int, ldc:int(2)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_190 = and:int(var_2_190:int, ldc:int(-759461254))
            }
            
            var_2_190 = and:int(var_2_190:int, ldc:int(1794291685))
            var_4_1A0 = invokestatic:String(\ud7e8\ua3b4\uc9f6\u56bd\u2dcc\u718f::\u8d90\u1833\u0b8e\u8cae\u5140\u8640, p0:String, loadelement:String(getstatic:String[](\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u600f\ua3b4\u71ae\u6c52\u8308\ud51e), xor:int(ldc:int(-31744), ldc:int(-31743))))
            var_2_190 = and:int(var_2_190:int, ldc:int(-636682835))
            var_5_1C5 = invokevirtual:ZipEntry(ZipFile::getEntry, getfield:ZipFile(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u836c\uf9c5\u3c25\u9a18\u8df4\u6198, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\ua068\u8aa5\uc910\ubb2b\ufcaf\ua562, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833)), var_4_1A0:String)))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_190:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_190 = and:int(var_2_190:int, ldc:int(-821775099))
                    
                    if (cmpeq:boolean(var_5_1C5:ZipEntry, aconstnull:ZipEntry())) {
                        stack_20A_0 = and:int(ldc:int(-20841), ldc:int(20840))
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_190:int, ldc:int(4194304)), ldc:int(0))) {
                    var_2_190 = and:int(var_2_190:int, ldc:int(1241496993))
                    stack_20A_0 = xor:int(ldc:int(1346), ldc:int(1347))
                    looporswitchbreak()
                }
                
                var_2_190 = and:int(var_2_190:int, ldc:int(-1954803209))
            }
            
            var_2_190 = and:int(var_2_190:int, ldc:int(-1814005937))
            return:boolean(stack_20A_0:int)
        }
        catch (java.io.IOException var_4_20F) {
            return:boolean(and:int[expected:boolean](ldc:int(-15054), ldc:int(6849)))
        }
    }
    
    public java.lang.String \u7bad\ubcb0\u965f\u718f\u4179\u8d98() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:String(invokevirtual:String(File::getName, getfield:File(\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\ub1b9\u759a\u839e\u6b0d\u7873\u3504, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_275 : int
        expr_6E : int [generated]
        stack_BD_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_13B_0 : byte[] [generated]
        stack_13D_0 : byte[] [generated]
        stack_171_0 : byte[] [generated]
        stack_173_0 : byte[] [generated]
        stack_1AE_0 : byte[] [generated]
        stack_28F_0 : byte[] [generated]
        stack_2CA_0 : byte[] [generated]
        stack_338_0 : byte[] [generated]
        stack_38D_0 : byte[] [generated]
        stack_401_0 : byte[] [generated]
        var_4_260 : int
        var_3_265 : byte[]
        var_5_266 : int
        var_0_383 : int
        expr_38D : byte [generated]
        stack_3CC_2 : byte [generated]
        stack_3AA_0 : byte [generated]
        var_2_BD : byte[]
        expr_C1 : int [generated]
        var_3_2B8 : byte[]
        var_5_2B9 : int
        expr_109 : int [generated]
        expr_13D : int [generated]
        expr_173 : int [generated]
        var_3_3EF : byte[]
        var_5_3F0 : int
        expr_401 : byte [generated]
        var_3_1BA : String
        stack_259_0 : String[] [generated]
        expr_1CC : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_0_275 = and:int(ldc:int(-1641659663), ldc:int(-1229533611))
        expr_6E = arraylength:int(stack_BD_0 = stack_BF_0 = stack_107_0 = stack_109_0 = stack_13B_0 = stack_13D_0 = stack_171_0 = stack_173_0 = stack_1AE_0 = stack_28F_0 = stack_2CA_0 = stack_338_0 = stack_38D_0 = stack_401_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("R0SyHxpM/P5VdMS0lDSLJKy0zlV0xLSUNIs1fg==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_260 = expr_6E:int
        var_3_265 = newarray:byte[](byte.class, expr_6E:int)
        var_5_266 = expr_6E:int
        Label_0616:
        
        while (cmpeq:boolean(and:int(var_0_275:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_275:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0785)
            }
            
            var_0_275 = and:int(var_0_275:int, ldc:int(-2022207401))
            var_5_266 = add:int(var_5_266:int, ldc:int(-1))
            storeelement:byte(var_3_265:byte[], var_5_266:int, xor:byte(loadelement:byte(stack_28F_0:byte[], var_5_266:int), ldc:byte(126)))
            
            if (cmpne:boolean(var_5_266:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_BF_0 = stack_BD_0 = stack_107_0 = stack_109_0 = stack_13B_0 = stack_13D_0 = stack_171_0 = stack_173_0 = stack_1AE_0 = stack_28F_0 = stack_2CA_0 = stack_338_0 = stack_38D_0 = stack_401_0 = var_3_265:byte[]
            goto(Label_0115)
        }
        
        var_0_275 = and:int(var_0_275:int, ldc:int(1036120856))
        goto(Label_0871)
        Label_0785:
        
        while (cmpeq:boolean(and:int(var_0_275:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_275:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_275 = and:int(var_0_275:int, ldc:int(-983724162))
                goto(Label_0616)
            }
            
            var_0_275 = and:int(var_0_275:int, ldc:int(-1364963505))
            var_5_266 = add:int(var_5_266:int, ldc:int(-1))
            storeelement:byte(var_3_265:byte[], var_5_266:int, add:byte(loadelement:byte(stack_338_0:byte[], var_5_266:int), ldc:byte(91)))
            
            if (cmpne:boolean(var_5_266:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_BF_0 = stack_BD_0 = stack_107_0 = stack_109_0 = stack_13B_0 = stack_13D_0 = stack_171_0 = stack_173_0 = stack_1AE_0 = stack_28F_0 = stack_2CA_0 = stack_338_0 = stack_38D_0 = stack_401_0 = var_3_265:byte[]
            goto(Label_0270)
        }
        
        Label_0871:
        
        while (cmpne:boolean(and:int(var_0_275:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_275:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0616)
            }
            
            var_0_383 = and:int(var_0_275:int, ldc:int(-1777560243))
            var_5_266 = add:int(var_5_266:int, ldc:int(-1))
            expr_38D = stack_3CC_2 = loadelement(stack_38D_0, var_5_266)
            
            if (cmplt:boolean(add:int(add:int(var_5_266:int, ldc:int(1)), neg:int(var_4_260:int)), ldc:int(0))) {
                stack_3CC_2 = stack_3AA_0 = add:byte(expr_38D:byte, loadelement:byte(var_3_265:byte[], add:int(var_5_266:int, ldc:int(1))))
                goto(Label_0954)
            }
            
            Label_0922:
            
            if (cmpeq:boolean(and:int(var_0_383:int, ldc:int(2048)), ldc:int(0))) {
                var_0_383 = and:int(var_0_383:int, ldc:int(-1501239867))
                stack_3CC_2 = stack_3AA_0 = add:byte(expr_38D:byte, ldc:byte(1))
            }
            
            Label_0954:
            
            if (cmpeq:boolean(and:int(var_0_383:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0922)
            }
            
            var_0_275 = and:int(var_0_383:int, ldc:int(-952831025))
            storeelement:byte(var_3_265:byte[], var_5_266:int, stack_3CC_2:byte)
            
            if (cmpne:boolean(var_5_266:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_BF_0 = stack_BD_0 = stack_107_0 = stack_109_0 = stack_13B_0 = stack_13D_0 = stack_171_0 = stack_173_0 = stack_1AE_0 = stack_28F_0 = stack_2CA_0 = stack_338_0 = stack_38D_0 = stack_401_0 = var_3_265:byte[]
            goto(Label_0322)
        }
        
        var_0_275 = and:int(var_0_275:int, ldc:int(1405453859))
        goto(Label_0785)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_275:int, ldc:int(4)), ldc:int(0))) {
            var_0_275 = and:int(var_0_275:int, ldc:int(-363609900))
            goto(Label_0376)
        }
        
        if (cmpeq:boolean(and:int(var_0_275:int, ldc:int(1)), ldc:int(0))) {
            var_0_275 = and:int(var_0_275:int, ldc:int(1410335179))
            goto(Label_0322)
        }
        
        if (cmpeq:boolean(and:int(var_0_275:int, ldc:int(1)), ldc:int(0))) {
            var_0_275 = and:int(var_0_275:int, ldc:int(666668767))
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_275:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_275 = and:int(var_0_275:int, ldc:int(1392336858))
        }
        else {
            var_0_275 = and:int(var_0_275:int, ldc:int(-1496517645))
            var_2_BD = stack_BD_0:byte[]
            expr_C1 = add:int(arraylength:int(stack_BF_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C1:int, ldc:int(0))) {
                var_3_2B8 = newarray:byte[](byte.class, expr_C1:int)
                var_5_2B9 = expr_C1:int
                
                loop {
                    var_0_275 = and:int(var_0_275:int, ldc:int(-672783367))
                    var_5_2B9 = add:int(var_5_2B9:int, ldc:int(-1))
                    storeelement:byte(var_3_2B8:byte[], var_5_2B9:int, add:int(shl:int(loadelement:byte(stack_2CA_0:byte[], var_5_2B9:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_BD:byte[], add:int(var_5_2B9:int, and:int(ldc:int(25097), ldc:int(4291)))), ldc:int(7)), and:int(ldc:int(4613), ldc:int(2187)))))
                    
                    if (cmpne:boolean(var_5_2B9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_BF_0 = stack_BD_0 = stack_107_0 = stack_109_0 = stack_13B_0 = stack_13D_0 = stack_171_0 = stack_173_0 = stack_1AE_0 = stack_28F_0 = stack_2CA_0 = stack_338_0 = stack_38D_0 = stack_401_0 = var_3_2B8:byte[]
            }
        }
        
        Label_0198:
        
        if (cmpne:boolean(and:int(var_0_275:int, ldc:int(2)), ldc:int(0))) {
            var_0_275 = and:int(var_0_275:int, ldc:int(-366595011))
            goto(Label_0376)
        }
        
        if (cmpne:boolean(and:int(var_0_275:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0322)
        }
        
        if (cmpeq:boolean(and:int(var_0_275:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_275 = and:int(var_0_275:int, ldc:int(-1013257932))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_275:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_275 = and:int(var_0_275:int, ldc:int(-951215502))
                goto(Label_0115)
            }
            
            var_0_275 = and:int(var_0_275:int, ldc:int(-2040718909))
            expr_109 = arraylength:int(stack_109_0:byte[])
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_4_260 = expr_109:int
                var_3_265 = newarray:byte[](byte.class, expr_109:int)
                var_5_266 = expr_109:int
                goto(Label_0785)
            }
        }
        
        Label_0270:
        
        if (cmpeq:boolean(and:int(var_0_275:int, ldc:int(262144)), ldc:int(0))) {
            var_0_275 = and:int(var_0_275:int, ldc:int(893418947))
            goto(Label_0376)
        }
        
        if (cmpne:boolean(and:int(var_0_275:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_275:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0198)
            }
            
            if (cmpeq:boolean(and:int(var_0_275:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_275 = and:int(var_0_275:int, ldc:int(-429589027))
            expr_13D = arraylength:int(stack_13D_0:byte[])
            
            if (cmpne:boolean(expr_13D:int, ldc:int(0))) {
                var_4_260 = expr_13D:int
                var_3_265 = newarray:byte[](byte.class, expr_13D:int)
                var_5_266 = expr_13D:int
                goto(Label_0871)
            }
        }
        
        Label_0322:
        
        if (cmpne:boolean(and:int(var_0_275:int, ldc:int(2)), ldc:int(0))) {
            var_0_275 = and:int(var_0_275:int, ldc:int(517909963))
        }
        else {
            if (cmpne:boolean(and:int(var_0_275:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0270)
            }
            
            if (cmpne:boolean(and:int(var_0_275:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0198)
            }
            
            if (cmpeq:boolean(and:int(var_0_275:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_275 = and:int(var_0_275:int, ldc:int(-25783581))
            expr_173 = arraylength:int(stack_173_0:byte[])
            
            if (cmpne:boolean(expr_173:int, ldc:int(0))) {
                var_3_3EF = newarray:byte[](byte.class, expr_173:int)
                var_5_3F0 = expr_173:int
                
                loop {
                    var_0_275 = and:int(var_0_275:int, ldc:int(-161528639))
                    var_5_3F0 = add:int(var_5_3F0:int, ldc:int(-1))
                    expr_401 = loadelement:byte(stack_401_0:byte[], var_5_3F0:int)
                    storeelement:byte(var_3_3EF:byte[], var_5_3F0:int, or:int(and:int(shl:int(expr_401:byte, xor:int(ldc:int(146), ldc:int(150))), ldc:int(-16)), and:int(shr:int(expr_401:byte[expected:int], xor:int(ldc:int(2570), ldc:int(2574))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_3F0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_BF_0 = stack_BD_0 = stack_107_0 = stack_109_0 = stack_13B_0 = stack_13D_0 = stack_171_0 = stack_173_0 = stack_1AE_0 = stack_28F_0 = stack_2CA_0 = stack_338_0 = stack_38D_0 = stack_401_0 = var_3_3EF:byte[]
            }
        }
        
        Label_0376:
        
        if (cmpeq:boolean(and:int(var_0_275:int, ldc:int(262144)), ldc:int(0))) {
            var_0_275 = and:int(var_0_275:int, ldc:int(-1240861137))
            goto(Label_0322)
        }
        
        if (cmpeq:boolean(and:int(var_0_275:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_275 = and:int(var_0_275:int, ldc:int(1244365991))
            goto(Label_0270)
        }
        
        if (cmpne:boolean(and:int(var_0_275:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0198)
        }
        
        if (cmpeq:boolean(and:int(var_0_275:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_1BA = initobject:String(String::<init>, stack_1AE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_259_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(25365), ldc:int(173)))
            expr_1CC = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-24569), ldc:int(-24574)))
            storeelement:String(expr_1CC:String[], and:int(ldc:int(10305), ldc:int(-10306)), invokevirtual:String[expected:String](String::substring, var_3_1BA:String, and:int(ldc:int(-17056), ldc:int(17055)), and:int(ldc:int(-5554), ldc:int(5537))))
            storeelement:String(expr_1CC:String[], xor:int(ldc:int(18), ldc:int(22)), invokevirtual:String[expected:String](String::substring, var_3_1BA:String, and:int(ldc:int(-22149), ldc:int(22144)), and:int(ldc:int(4656), ldc:int(8212))))
            storeelement:String(expr_1CC:String[], xor:int(ldc:int(4129), ldc:int(4131)), invokevirtual:String[expected:String](String::substring, var_3_1BA:String, xor:int(ldc:int(8973), ldc:int(8989)), and:int(ldc:int(2067), ldc:int(4122))))
            storeelement:String(expr_1CC:String[], xor:int(ldc:int(514), ldc:int(515)), invokevirtual:String[expected:String](String::substring, var_3_1BA:String, and:int(ldc:int(20563), ldc:int(10002)), and:int(ldc:int(4211), ldc:int(1951))))
            storeelement:String(expr_1CC:String[], and:int(ldc:int(7), ldc:int(787)), invokevirtual:String[expected:String](String::substring, var_3_1BA:String, and:int(ldc:int(1075), ldc:int(18463)), and:int(ldc:int(123), ldc:int(6171))))
            putstatic:String[](\u759a\u92ff\u7330\u71ae\ufcaf\u1833::\u600f\ua3b4\u71ae\u6c52\u8308\ud51e, expr_1CC:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ud4fe\u0c95\uf995\u4c2b\u927d\u5fe1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_666 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_671 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_666 = and:int(ldc:int(1296248823), ldc:int(-246480585))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u759a\u92ff\u7330\u71ae\ufcaf\u1833[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
            var_3_666 = and:int(var_3_666:int, ldc:int(-1928905249))
            var_5_81 = and:int(ldc:int(23041), ldc:int(-23170))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18008), ldc:int(-22240)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_666:int, ldc:int(-1077206127))
                    var_9_C7 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_88:int, xor:int(ldc:int(-16351), ldc:int(-16352)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(5), ldc:int(18305)))), var_7_97:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_666 = and:int(var_3_D9:int, ldc:int(1506265975))
                    var_14_114 = var_7_97:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(25728), ldc:int(25729)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_88:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1523)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1345097637))
                        goto(Label_1234)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1618047993))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(669657603))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(312928084))
                        goto(Label_0591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-749499403))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0591)
                            }
                            
                            goto(Label_0833)
                        }
                    }
                    
                    Label_0403:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-2128379496))
                        goto(Label_1523)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1347918716))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(20553233))
                        goto(Label_1234)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-695217858))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(2033833855))
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1577582858))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1048851332))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-974944931))
                        var_11_EA = and:int(ldc:int(-28065), ldc:int(11680))
                        goto(Label_1512)
                    }
                    
                    Label_0591:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1383157856))
                        goto(Label_1523)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1234)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1268139173))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1936843380))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(256)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-170003497))
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(1672965435))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0833)
                        }
                    }
                    
                    Label_0709:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1852969326))
                        goto(Label_1523)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1234)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-708501174))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(2011188902))
                            goto(Label_0591)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1157809465))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(591912955))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0833:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1133175011))
                        goto(Label_1523)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(290248966))
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1234)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1979327317))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1307125873))
                            goto(Label_0591)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(224056944))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1354280521))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EA = and:int(ldc:int(3), ldc:int(1029))
                                goto(Label_1133)
                            }
                        }
                    }
                    
                    Label_0961:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1523)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-933068414))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(608588250))
                        goto(Label_1234)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(256)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1819852420))
                            goto(Label_0833)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(100371730))
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(256)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(722673188))
                            goto(Label_0591)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1827407390))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(1796176159))
                        var_11_EA = and:int(ldc:int(-32598), ldc:int(10065))
                    }
                    
                    Label_1133:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1523)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-2051377535))
                            goto(Label_0961)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0833)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0591)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-509963225))
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1219499147))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1372)
                            }
                        }
                    }
                    
                    Label_1234:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1416255539))
                        goto(Label_1523)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1133)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0961)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0833)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-398048880))
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-1124989816))
                            goto(Label_0591)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-672878324))
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-1391257269))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(1163130845))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_81:int, var_16_118:int)
                        goto(Label_1512)
                    }
                    
                    Label_1372:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1468449942))
                        goto(Label_1523)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-935704576))
                        goto(Label_1234)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(498709573))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1781197417))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-2073415283))
                        loopcontinue()
                    }
                    
                    var_3_666 = and:int(var_3_666:int, ldc:int(660550035))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1512:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_671 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1523:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1234)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-97502418))
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(75920603))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1928691380))
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1114957855))
                        goto(Label_0591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-344256065))
                        var_17_671 = add:int(var_16_118:int, and:int(ldc:int(8193), ldc:int(17509)))
                        looporswitchbreak()
                    }
                    
                    var_3_666 = and:int(var_3_666:int, ldc:int(-1693712248))
                }
                
                var_3_666 = and:int(var_3_666:int, ldc:int(2007968695))
                
                if (cmple:boolean(var_5_81 = var_17_671:int, sub:int(var_6_88:int, xor:int(ldc:int(16640), ldc:int(16641))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
            var_3_666 = and:int(var_3_666:int, ldc:int(259856718))
            goto(Label_0108)
        }
    }
}
