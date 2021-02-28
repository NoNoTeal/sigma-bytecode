public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\ubb2b\ua3b4\ud523\u76bc\ucfaf {
    public void \ubb2b\ua3b4\ud523\u76bc\ucfaf(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uf94d\u5db4\ud7e8\ucb79\u6d69 p0) {
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
            putfield:\uf94d\u5db4\ud7e8\ucb79\u6d69(\ubb2b\ua3b4\ud523\u76bc\ucfaf::\ud158\ucef1\u600f\u8cae\u3dd3, this:\ubb2b\ua3b4\ud523\u76bc\ucfaf, p0:\uf94d\u5db4\ud7e8\ucb79\u6d69)
            invokespecial:Object(Object::<init>, this:\ubb2b\ua3b4\ud523\u76bc\ucfaf)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int compare(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a p0, \u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a p1) {
        var_5_64 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_6_6A : \u7d52\u718f\u3776\u6fb0\ub83f
        var_7_77 : float
        var_8_84 : float
        
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
        var_5_64 = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, p0:\u8640\ud7e8\u8308\u4bc8\uc29a)
        var_6_6A = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, p1:\u8640\ud7e8\u8308\u4bc8\uc29a)
        var_7_77 = invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u98a4\ufe34\u6cfe\u3e75\u965f\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uf94d\u5db4\ud7e8\ucb79\u6d69::\u7043\ub70c\u8350\u0b8e\u516c)), var_5_64:\u7d52\u718f\u3776\u6fb0\ub83f)
        var_8_84 = invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u98a4\ufe34\u6cfe\u3e75\u965f\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uf94d\u5db4\ud7e8\ucb79\u6d69::\ubb2b\u62da\u40a9\uc910\u92ff)), var_6_6A:\u7d52\u718f\u3776\u6fb0\ub83f)
        
        if (cmplt:boolean(sub:float(var_7_77:float, var_8_84:float), ldc:float(0.0f))) {
            return:int(ldc:int(-1))
        }
        
        if (cmpne:boolean(sub:float(var_7_77:float, var_8_84:float), ldc:float(0.0f))) {
            return:int(and:int(ldc:int(5253), ldc:int(2081)))
        }
        
        return:int(and:int(ldc:int(24166), ldc:int(-32640)))
    }
    
    public int compare(java.lang.Object p0, java.lang.Object p1) {
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
            return:int(invokevirtual:int(\ubb2b\ua3b4\ud523\u76bc\ucfaf::compare, this:\ubb2b\ua3b4\ud523\u76bc\ucfaf, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, p0:Object[expected:\u8640\ud7e8\u8308\u4bc8\uc29a]), checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, p1:Object[expected:\u8640\ud7e8\u8308\u4bc8\uc29a])))
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6c52\ud7e8\u965f\u836c\uff55(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5ED : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5F8 : int
        
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
        var_3_5ED = and:int(ldc:int(-28285946), ldc:int(-1094699477))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubb2b\ua3b4\ud523\u76bc\ucfaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1065123818))
            var_5_7D = and:int(ldc:int(-23089), ldc:int(23088))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-15142), ldc:int(14885)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5ED:int, ldc:int(-17927162))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(2883), ldc:int(16393)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(293), ldc:int(292)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5ED = and:int(var_3_CA:int, ldc:int(-1076281686))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(142), ldc:int(143)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(849630319))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1845064185))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1268313824))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-54050769))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1515372416))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1687345553))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-11585954))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(998948437))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1690706642))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1690063831))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-526810654))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-3135969))
                            var_11_DB = and:int(ldc:int(-4670), ldc:int(4653))
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1977183580))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1963402613))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1724683008))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-2090989040))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1984685434))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1277481351))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1584433818))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-804772608))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(600524355))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(658293232))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2118430638))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1935522188))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1047787225))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-986354257))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1897362924))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(733514023))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-17352990))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-32704), ldc:int(-32703))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1029444477))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1144784720))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1921155605))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(2132063593))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2128586451))
                        var_11_DB = and:int(ldc:int(-5301), ldc:int(5300))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1732293598))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-143147560))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1196629861))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1149089774))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1506249449))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1227391802))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2043236207))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-335852764))
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1599622766))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1038206096))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2003873606))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1423)
                    }
                    
                    Label_1292:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-117294366))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1751706407))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1916626735))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1998331775))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-855740997))
                        loopcontinue()
                    }
                    
                    var_3_5ED = and:int(var_3_5ED:int, ldc:int(-134775018))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-3862125))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(262203294))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2012587562))
                        var_17_5F8 = add:int(var_16_109:int, xor:int(ldc:int(-32767), ldc:int(-32768)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1092534293))
                
                if (cmple:boolean(var_5_7D = var_17_5F8:int, sub:int(var_6_84:int, and:int(ldc:int(417), ldc:int(531))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
