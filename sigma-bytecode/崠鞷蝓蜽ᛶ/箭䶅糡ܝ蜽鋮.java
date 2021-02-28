public abstract class \u5d20\u97b7\u8753\u873d\u16f6.\u7bad\u4d85\u7ce1\u071d\u873d\u92ee {
    public static \u5d20\u97b7\u8753\u873d\u16f6.\u7bad\u4d85\u7ce1\u071d\u873d\u92ee \u836c\u647c\u7c6b\u3d4b\ub113\ud523(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0 p0) {
        var_3_B8 : \u7bad\u4d85\u7ce1\u071d\u873d\u92ee
        
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
            var_3_B8 = aconstnull:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee()
            
            if (invokeinterface:boolean(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u718f\ua6bd\u7d52\u4bc8\u836c\u92ff, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1935894637L))) {
                if (cmpeq:boolean(invokevirtual:long(\u7006\u647c\u183a\u9255\u9937\uf995::\u6d69\u76bc\uc910\u97b7\ua068\ub113, checkcast:\u7006\u647c\u183a\u9255\u9937\uf995(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u7006\u647c\u183a\u9255\u9937\uf995.class, invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0[expected:\u7006\u647c\u183a\u9255\u9937\uf995](\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1935894637L)))), invokestatic:long(\uae87\ub171\ubff1\u5db4\u88c5\u3e2a::\u88c5\u92ee\u5fe1\u4c2b\u40a9\ub7dc, getstatic:\uae87\ub171\ubff1\u5db4\u88c5\u3e2a(\uae87\ub171\ubff1\u5db4\u88c5\u3e2a::\u2dcc\uc9f6\u873d\ub8be\u7873\u8cae)))) {
                    var_3_B8 = initobject:\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2[expected:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee](\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2::<init>, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0)
                }
            }
            
            if (cmpeq:boolean(var_3_B8:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee, aconstnull:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee())) {
                var_3_B8 = initobject:\u71f1\u0c95\u3776\ua562\u4492\u8753[expected:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee](\u71f1\u0c95\u3776\ua562\u4492\u8753::<init>, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0)
            }
            
            return:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee(var_3_B8:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee)
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\u4d85\u7ce1\u071d\u873d\u92ee(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0 p0) {
        var_4_72 : long
        var_6_7A : \u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56
        var_6_8F : \u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56
        
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
            invokespecial:Object(Object::<init>, this:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee)
            var_4_72 = invokevirtual:long(\u392e\ub8be\u8bb0\u93a2\u3d64\u3c25::\u416d\ua61f\u494c\u8aa5\u5f50\u8640, checkcast:\u392e\ub8be\u8bb0\u93a2\u3d64\u3c25(\u3504\ufe34\u600f\u6b0d\u69d9.\u392e\ub8be\u8bb0\u93a2\u3d64\u3c25.class, invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0[expected:\u392e\ub8be\u8bb0\u93a2\u3d64\u3c25](\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1718775137L))))
            
            if (invokevirtual:boolean(Object::equals, var_6_7A = invokestatic:\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56(\ua6bd\u183a\u8d90\uc2bd\u1833\u98a4::\ua6bd\u2dcc\uc3e3\u624e\u6c56\u446c, var_4_72:long), getstatic:\ua6bd\u183a\u8d90\uc2bd\u1833\u98a4[expected:Object](\ua6bd\u183a\u8d90\uc2bd\u1833\u98a4::\u5140\u5d20\u34df\uc31c\u8cae\u4c2b))) {
                if (invokevirtual:boolean(Object::equals, var_6_8F = invokestatic:\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56(\u3c25\u873d\uc2bd\u3bd6\uc229\u8753::\u6c52\u6198\ub1b9\u4c2b\u759a\u946b, var_4_72:long), getstatic:\u3c25\u873d\uc2bd\u3bd6\uc229\u8753[expected:Object](\u3c25\u873d\uc2bd\u3bd6\uc229\u8753::\u3d64\u97b7\ubf56\u3776\u88c5\u8258))) {
                    putfield:\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56(\u7bad\u4d85\u7ce1\u071d\u873d\u92ee::\u156b\u527a\u7043\u4bc8\uff55\u983f, this:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee, aconstnull:\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56())
                }
                else {
                    putfield:\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56(\u7bad\u4d85\u7ce1\u071d\u873d\u92ee::\u156b\u527a\u7043\u4bc8\uff55\u983f, this:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee, var_6_8F:\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56)
                }
            }
            else {
                putfield:\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56(\u7bad\u4d85\u7ce1\u071d\u873d\u92ee::\u156b\u527a\u7043\u4bc8\uff55\u983f, this:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee, var_6_7A:\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56 \u71f1\uf995\ud7e8\ufcaf\u836c\u6d99() {
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
            return:\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56(getfield:\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56(\u7bad\u4d85\u7ce1\u071d\u873d\u92ee::\u156b\u527a\u7043\u4bc8\uff55\u983f, this:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee))
        }
        
        goto(Label_0006)
    }
    
    public abstract \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uae87\ub171\ubff1\u5db4\u88c5\u3e2a \u3711\u67e9\ubff1\u8350\u7ce1\ubb2b();
    
    public void \u839e\u4ab3\u7d52\u9033\u0800\u51b2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_603 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_60E : int
        
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
        var_3_603 = and:int(ldc:int(1240296721), ldc:int(-6490463))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_603 = and:int(var_3_603:int, ldc:int(1871080139))
            var_5_7D = and:int(ldc:int(26642), ldc:int(-26931))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(13646), ldc:int(-14159)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_603:int, ldc:int(1874322474))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(4097), ldc:int(1573)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(10369), ldc:int(1149)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_603 = and:int(var_3_CA:int, ldc:int(-373887612))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(17056), ldc:int(17057)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(637142281))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-845644263))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-821404518))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(2)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(217931300))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(2)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(104089834))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(2)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(1772513426))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(1299951594))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1968567954))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(1581814164))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1361046021))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(2)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(223209877))
                            loopcontinue()
                        }
                        
                        var_3_603 = and:int(var_3_603:int, ldc:int(-645045761))
                        var_11_DB = and:int(ldc:int(-24944), ldc:int(16749))
                        goto(Label_1415)
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(2089793948))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(2113509403))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(64)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-678423239))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-240480839))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_603 = and:int(var_3_603:int, ldc:int(1843165634))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-728543486))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1020079700))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1093694001))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(561534495))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(704535479))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_603 = and:int(var_3_603:int, ldc:int(1606937845))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1788586428))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(1240708122))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(219633246))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(64)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(1405442897))
                            loopcontinue()
                        }
                        
                        var_3_603 = and:int(var_3_603:int, ldc:int(-607786824))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(2145), ldc:int(2144))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-907156002))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(1227205382))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-1883261242))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(1085863201))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(32)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(173693616))
                            loopcontinue()
                        }
                        
                        var_3_603 = and:int(var_3_603:int, ldc:int(2074896143))
                        var_11_DB = and:int(ldc:int(4436), ldc:int(-4437))
                    }
                    
                    Label_1051:
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-756117456))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-1481638242))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-620439605))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_603 = and:int(var_3_603:int, ldc:int(1503979285))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(2084240625))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(1188213262))
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-1825806271))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(62161934))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-1917148115))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-221159866))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(1273913346))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1292:
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(64)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(2102109353))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(795940564))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(324759517))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(1232137813))
                        loopcontinue()
                    }
                    
                    var_3_603 = and:int(var_3_603:int, ldc:int(-337351071))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1415:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60E = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1426:
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1607709143))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-159682094))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-2017621935))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-981795485))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(2)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-906500961))
                        var_17_60E = add:int(var_16_109:int, xor:int(ldc:int(257), ldc:int(256)))
                        looporswitchbreak()
                    }
                    
                    var_3_603 = and:int(var_3_603:int, ldc:int(1924950268))
                }
                
                var_3_603 = and:int(var_3_603:int, ldc:int(1504174278))
                
                if (cmple:boolean(var_5_7D = var_17_60E:int, sub:int(var_6_84:int, and:int(ldc:int(2313), ldc:int(12817))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
