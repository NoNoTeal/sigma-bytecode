public class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u3e2a\u5d20\u8350\u52d3\ua3b4 {
    public void \u3e2a\u5d20\u8350\u52d3\ua3b4() {
        var_3_C5 : File
        var_4_EF : int
        var_4_123 : String[]
        
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
            invokespecial:\uff55\uc9f6\u5d20\u4f4a\u3c25(\uff55\uc9f6\u5d20\u4f4a\u3c25::<init>, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), and:int(ldc:int(16510), ldc:int(-16511))), loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), and:int(ldc:int(1409), ldc:int(4117))), getstatic:\ucef1\u3504\u64f2\u6cfe\u52d3(\ucef1\u3504\u64f2\u6cfe\u52d3::\u760c\u3d4b\u62da\u3e75\u5bc4))
            putfield:List<String>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6b0d\u7ce1\u88c5\u9a18\u1187, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, initobject:ArrayList<String>[expected:List<String>](ArrayList<E>::<init>))
            putfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, initobject:ArrayList<\ub7dc\u156b\u5f50\u9af2\u7330>[expected:List<\ub7dc\u156b\u5f50\u9af2\u7330>](ArrayList<E>::<init>))
            putfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u4f4a\u6cfe\ub1b9\u99f7\ud171, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, initobject:ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>](ArrayList<E>::<init>))
            var_3_C5 = initobject:File(File::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:File[expected:Object](\u6b0d\ua068\uc4d2\u5245\u4d85::\u40a9\u983f\u946b\ud36e\u760c, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))), loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), xor:int(ldc:int(4170), ldc:int(4168))))))
            
            if (invokevirtual:boolean(File::exists, var_3_C5:File)) {
                putfield:List<String>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6b0d\u7ce1\u88c5\u9a18\u1187, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, initobject:ArrayList<E>(ArrayList<Object>::<init>, invokestatic:List<String>(Arrays::asList, invokevirtual:String[](File::list, var_3_C5:File))))
                var_4_EF = and:int(ldc:int(17443), ldc:int(-17444))
                
                while (cmplt:boolean(var_4_EF:int, invokeinterface:int(List<E>::size, getfield:List<String>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6b0d\u7ce1\u88c5\u9a18\u1187, this:\u3e2a\u5d20\u8350\u52d3\ua3b4)))) {
                    if (invokevirtual:boolean(String::startsWith, checkcast:String(java.lang.String.class, invokeinterface:String(List<String>::get, getfield:List<String>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6b0d\u7ce1\u88c5\u9a18\u1187, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), var_4_EF:int)), loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), and:int(ldc:int(259), ldc:int(16459))))) {
                        invokeinterface:String(List<String>::remove, getfield:List<String>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6b0d\u7ce1\u88c5\u9a18\u1187, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), var_4_EF:int)
                        looporswitchbreak()
                    }
                    
                    inc:int(var_4_EF, ldc:int(1))
                }
                
                var_4_123 = checkcast:String[](java.lang.String[].class, invokeinterface:String[](List<String>::toArray, getfield:List<String>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6b0d\u7ce1\u88c5\u9a18\u1187, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), newarray:String[](java.lang.String.class, invokeinterface:int(List<E>::size, getfield:List<String>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6b0d\u7ce1\u88c5\u9a18\u1187, this:\u3e2a\u5d20\u8350\u52d3\ua3b4)))))
                
                if (cmpgt:boolean(arraylength:int(var_4_123:String[]), ldc:int(0))) {
                    invokevirtual:void(\ud158\u839e\u7006\uc3e3\u446c::\u1187\u4bc8\u61a4\u839e\ubff1, this:\u3e2a\u5d20\u8350\u52d3\ua3b4[expected:\ud158\u839e\u7006\uc3e3\u446c], initobject:\uc4d2\uc238\u8413\u527a\u52d3(\uc4d2\uc238\u8413\u527a\u52d3::<init>, loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), and:int(ldc:int(22543), ldc:int(9284))), loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), xor:int(ldc:int(18459), ldc:int(18462))), and:int(ldc:int(-12521), ldc:int(12520)), var_4_123:String[]))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4d85\u1187\u8709\uc31c\u4e72(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u983f\u7ce1\uceb8\ubded\u3a62 p0) {
        var_2_5F : int
        var_2_2C2 : int
        var_4_2DB : Iterator<\u759a\ua068\ubefe\u624e\u6d69>
        var_6_390 : \u718f\u8d98\uc87f\u983f\u8bb0
        var_2_3F4 : int
        var_7_3A6 : Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>
        var_8_3D7 : \ub7dc\u156b\u5f50\u9af2\u7330
        var_9_4C4 : float[]
        
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
        var_2_5F = and:int(ldc:int(607115866), ldc:int(-1476535054))
        
        if (logicalnot:boolean(invokevirtual:boolean(\uff55\uc9f6\u5d20\u4f4a\u3c25::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u3e2a\u5d20\u8350\u52d3\ua3b4[expected:\uff55\uc9f6\u5d20\u4f4a\u3c25]))) {
            return:void()
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0615)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0538)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0436)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0346)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(524288)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-684992714))
                goto(Label_0248)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1514283014))
                
                if (cmpeq:boolean(getfield:\u7049\u836c\u4179\u3e2a\u6b0d(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6ec6\u8aa5\u34df\u3bc9\ubcb0, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), aconstnull:\u7049\u836c\u4179\u3e2a\u6b0d())) {
                    return:void()
                }
            }
            
            Label_0165:
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16384)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1739616606))
                goto(Label_0615)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0538)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0436)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1113447327))
                goto(Label_0346)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1755854670))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(1680727002))
                
                if (invokevirtual:boolean(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\ubb2b\ub8be\uf9c5\u6435\u8bb0\u3d64, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)))) {
                    invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\uc84e\u120d\u71ae\u527a\u9937, loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), and:int(ldc:int(518), ldc:int(30951))))
                    invokevirtual:void(\uff55\uc9f6\u5d20\u4f4a\u3c25::\u64ab\u7d52\u5f50\uc3e3\ubb2b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4[expected:\uff55\uc9f6\u5d20\u4f4a\u3c25], and:int[expected:boolean](ldc:int(14419), ldc:int(-14424)))
                    return:void()
                }
            }
            
            Label_0248:
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0615)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1027753448))
                goto(Label_0538)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(171991030))
                goto(Label_0436)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2048)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-8627174))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1846998565))
                    goto(Label_0165)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1350341599))
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(-311436417))
                
                if (logicalnot:boolean(invokevirtual:boolean(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7af6\u4179\u873d\ud217\uc31c, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4)))) {
                    if (cmpeq:boolean(rem:int(getfield:int(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b))), xor:int(ldc:int(3073), ldc:int(3077))), ldc:int(0))) {
                        invokevirtual:boolean(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u4492\ua068\ua6bd\u3c25\ufcaf, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))
                    }
                }
            }
            
            Label_0346:
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(470697153))
                goto(Label_0615)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0538)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(268435456)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1660902364))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-522636095))
                    goto(Label_0248)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(602025179))
                    goto(Label_0165)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1245709217))
                
                if (logicalnot:boolean(invokevirtual:boolean(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ud51e\u836c\ub70c\uc31c\u960f, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4)))) {
                    return:void()
                }
            }
            
            Label_0436:
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1215065096))
                goto(Label_0615)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(262144)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(369910210))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0346)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(945540384))
                    goto(Label_0248)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(1727922038))
                
                if (cmpne:boolean(div:double(invokestatic:double(Math::floor, f2d:double(rem:float(i2f:float(getfield:int(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)))), invokevirtual:float(\u7049\u836c\u4179\u3e2a\u6b0d::\ufcaf\u6d99\uf94d\ub113\ub6ab, getfield:\u7049\u836c\u4179\u3e2a\u6b0d(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6ec6\u8aa5\u34df\u3bc9\ubcb0, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))))), ldc:double(20.0)), ldc:double(0.0))) {
                    return:void()
                }
            }
            
            Label_0538:
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16777216)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0436)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(2080785626))
                    goto(Label_0346)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1487398180))
                    goto(Label_0248)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(65536)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1082138657))
                
                if (cmpgt:boolean(getfield:int(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7873\u4d85\u836c\ubff1\ubf56, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), invokevirtual:short[expected:int](\u7049\u836c\u4179\u3e2a\u6b0d::\u3a62\u34df\ud217\u6c56\u0a06, getfield:\u7049\u836c\u4179\u3e2a\u6b0d(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6ec6\u8aa5\u34df\u3bc9\ubcb0, this:\u3e2a\u5d20\u8350\u52d3\ua3b4)))) {
                    putfield:int(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7873\u4d85\u836c\ubff1\ubf56, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, and:int(ldc:int(18766), ldc:int(-19824)))
                }
            }
            
            Label_0615:
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1435237794))
                goto(Label_0538)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(65536)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-11022553))
                goto(Label_0436)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1828671935))
                goto(Label_0346)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(524288)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1466675909))
                goto(Label_0248)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-770148941))
                goto(Label_0165)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(32768)), ldc:int(0))) {
                var_2_2C2 = and:int(var_2_5F:int, ldc:int(1820319479))
                invokeinterface:void(List<E>::clear, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u4f4a\u6cfe\ub1b9\u99f7\ud171, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))
                var_4_2DB = invokeinterface:Iterator<\u759a\ua068\ubefe\u624e\u6d69>(Collection<\u759a\ua068\ubefe\u624e\u6d69>::iterator, invokevirtual:Collection<\u759a\ua068\ubefe\u624e\u6d69>(HashMap<Integer, \u759a\ua068\ubefe\u624e\u6d69>::values, invokevirtual:HashMap<Integer, \u759a\ua068\ubefe\u624e\u6d69>(\u7049\u836c\u4179\u3e2a\u6b0d::\ubded\u6c56\uae5d\u3a62\u3776, getfield:\u7049\u836c\u4179\u3e2a\u6b0d(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6ec6\u8aa5\u34df\u3bc9\ubcb0, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))))
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_2DB:Iterator<\u759a\ua068\ubefe\u624e\u6d69>)) {
                    var_6_390 = invokevirtual:\u718f\u8d98\uc87f\u983f\u8bb0(\u759a\ua068\ubefe\u624e\u6d69::\ucfaf\ud7e8\ub32d\u6435\u40a9, checkcast:\u759a\ua068\ubefe\u624e\u6d69(\ud36e\u6bb9\u960f\u4c04\u64ab.\u759a\ua068\ubefe\u624e\u6d69.class, invokeinterface:\u759a\ua068\ubefe\u624e\u6d69(Iterator<\u759a\ua068\ubefe\u624e\u6d69>::next, var_4_2DB:Iterator<\u759a\ua068\ubefe\u624e\u6d69>)), getfield:int(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7873\u4d85\u836c\ubff1\ubf56, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))
                    
                    if (cmpne:boolean(var_6_390:\u718f\u8d98\uc87f\u983f\u8bb0, aconstnull:\u718f\u8d98\uc87f\u983f\u8bb0())) {
                        var_2_3F4 = and:int(var_2_2C2:int, ldc:int(1690304511))
                        var_7_3A6 = invokeinterface:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>(List<\ub7dc\u156b\u5f50\u9af2\u7330>::iterator, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))
                        
                        while (invokeinterface:boolean(Iterator<E>::hasNext, var_7_3A6:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>)) {
                            var_8_3D7 = checkcast:\ub7dc\u156b\u5f50\u9af2\u7330(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub7dc\u156b\u5f50\u9af2\u7330.class, invokeinterface:\ub7dc\u156b\u5f50\u9af2\u7330(Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>::next, var_7_3A6:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>))
                            
                            if (cmpne:boolean(invokevirtual:byte(\u718f\u8d98\uc87f\u983f\u8bb0::\u88c5\u1833\ubb2b\u0a06\uc9f6, var_6_390:\u718f\u8d98\uc87f\u983f\u8bb0), and:int(ldc:int(327), ldc:int(19)))) {
                                if (cmpeq:boolean(invokespecial:int(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub171\uc29a\u7e3f\ubded\u9a18, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, var_8_3D7:\ub7dc\u156b\u5f50\u9af2\u7330), ldc:int(0))) {
                                    goto(Label_1051)
                                }
                            }
                            
                            Label_1000:
                            
                            if (cmpeq:boolean(and:int(var_2_3F4:int, ldc:int(536870912)), ldc:int(0))) {
                                var_2_3F4 = and:int(var_2_3F4:int, ldc:int(1416526770))
                                goto(Label_1101)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_3F4:int, ldc:int(524288)), ldc:int(0))) {
                                var_2_3F4 = and:int(var_2_3F4:int, ldc:int(-1401179230))
                            }
                            else {
                                var_2_3F4 = and:int(var_2_3F4:int, ldc:int(-454042018))
                                
                                if (cmpne:boolean(invokevirtual:int(\ub7dc\u156b\u5f50\u9af2\u7330::\u8bb0\u6d69\u7c6b\ubff1\u392e, var_8_3D7:\ub7dc\u156b\u5f50\u9af2\u7330), invokevirtual:byte[expected:int](\u718f\u8d98\uc87f\u983f\u8bb0::\u88c5\u1833\ubb2b\u0a06\uc9f6, var_6_390:\u718f\u8d98\uc87f\u983f\u8bb0))) {
                                    loopcontinue()
                                }
                            }
                            
                            Label_1051:
                            
                            if (cmpne:boolean(and:int(var_2_3F4:int, ldc:int(2)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_2_3F4:int, ldc:int(2048)), ldc:int(0))) {
                                    var_2_3F4 = and:int(var_2_3F4:int, ldc:int(-549633746))
                                    goto(Label_1000)
                                }
                                
                                var_2_3F4 = and:int(var_2_3F4:int, ldc:int(1044380891))
                                
                                if (cmpeq:boolean(invokestatic:float(\ub7dc\uc229\u5bc4\ub8be\u7c6b::\u8cae\u494c\u5d20\u4d85\u8cae, getfield:float(\ub7dc\u156b\u5f50\u9af2\u7330::\u0a06\u527a\ucfaf\u3711\u960f, var_8_3D7:\ub7dc\u156b\u5f50\u9af2\u7330)), i2f:float(sub:byte[expected:int](invokevirtual:byte(\u718f\u8d98\uc87f\u983f\u8bb0::\u61a4\ucfaf\ud158\u51b2\uc2bd, var_6_390:\u718f\u8d98\uc87f\u983f\u8bb0), ldc:byte(33))))) {
                                    if (cmplt:boolean(invokestatic:double(Math::sqrt, invokevirtual:double(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8d98\u64f2\u97b7\ua6bd\uc229\u51fa, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b))), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_8_3D7:\ub7dc\u156b\u5f50\u9af2\u7330))), f2d:double(invokevirtual:float(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\u40a9\u5f50\u8753\u4bc8\u600f\u4ab3, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)))))) {
                                        var_9_4C4 = invokestatic:float[](\u4c2b\u3bd6\u385b\uc7fe\u8640::\u6b5f\u6435\u5f50\uc29a\u071d, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_8_3D7:\ub7dc\u156b\u5f50\u9af2\u7330), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))
                                        
                                        if (cmpgt:boolean(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_8_3D7:\ub7dc\u156b\u5f50\u9af2\u7330))), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b))), ldc:double(1.0)))) {
                                            var_9_4C4 = invokestatic:float[](\u4c2b\u3bd6\u385b\uc7fe\u8640::\u6b5f\u6435\u5f50\uc29a\u071d, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_8_3D7:\ub7dc\u156b\u5f50\u9af2\u7330), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u6d69\u7043\u6b5f\u36d3\u6bb9\u718f))
                                        }
                                        
                                        var_2_3F4 = and:int(var_2_3F4:int, ldc:int(-1481646346))
                                        invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)), initobject:\ubf56\u392e\u5fe1\u64f2\ud217(\ubf56\u392e\u5fe1\u64f2\ud217::<init>, loadelement:float(var_9_4C4:float[], and:int(ldc:int(-6088), ldc:int(5061))), loadelement:float(var_9_4C4:float[], xor:int(ldc:int(12), ldc:int(13))), getfield:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u8c8a\u62da\u7c6b\u385b\u3dd3\ud12e, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)))))
                                        invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)), initobject:\ubded\u9255\u92ff\u5d20\u97b7(\ubded\u9255\u92ff\u5d20\u97b7::<init>, getstatic:\ub19c\uc229\u416d\ub18d\u7873(\ub19c\uc229\u416d\ub18d\u7873::\u4179\u647c\ubefe\u7af6\u9937\u446c), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_8_3D7:\ub7dc\u156b\u5f50\u9af2\u7330), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d)))
                                        invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)), initobject:\ucef1\u51b2\u7330\uafe7\u3dd3[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\ucef1\u51b2\u7330\uafe7\u3dd3::<init>, getstatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u34df\ub113\u6c56\u97e6\u51b2\u4c2b::\uc238\u120d\u516c\u446c\u51fa\u40a9)))
                                        invokeinterface:boolean(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u4f4a\u6cfe\ub1b9\u99f7\ud171, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_8_3D7:\ub7dc\u156b\u5f50\u9af2\u7330))
                                    }
                                }
                            }
                            
                            Label_1101:
                            
                            if (cmpne:boolean(and:int(var_2_3F4:int, ldc:int(1073741824)), ldc:int(0))) {
                                goto(Label_1051)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_3F4:int, ldc:int(33554432)), ldc:int(0))) {
                                var_2_3F4 = and:int(var_2_3F4:int, ldc:int(1233819133))
                                goto(Label_1000)
                            }
                            
                            var_2_3F4 = and:int(var_2_3F4:int, ldc:int(2009070590))
                        }
                        
                        var_2_2C2 = and:int(var_2_3F4:int, ldc:int(-1531971469))
                    }
                }
                
                putfield:int(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7873\u4d85\u836c\ubff1\ubf56, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, add:int(getfield:int(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7873\u4d85\u836c\ubff1\ubf56, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), and:int(ldc:int(6209), ldc:int(8461))))
            }
        }
    }
    
    public boolean \ud51e\u836c\ub70c\uc31c\u960f(java.util.List<\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub7dc\u156b\u5f50\u9af2\u7330> p0) {
        var_2_B8 : int
        var_4_68 : Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>
        var_5_A5 : \ub7dc\u156b\u5f50\u9af2\u7330
        
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
        var_2_B8 = and:int(ldc:int(1881945990), ldc:int(-1359495181))
        var_4_68 = invokeinterface:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>(List<\ub7dc\u156b\u5f50\u9af2\u7330>::iterator, p0:List<\ub7dc\u156b\u5f50\u9af2\u7330>)
        
        loop {
            if (cmpeq:boolean(and:int(var_2_B8:int, ldc:int(134217728)), ldc:int(0))) {
                var_2_B8 = and:int(var_2_B8:int, ldc:int(-1489569814))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_68:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>)) {
                    var_5_A5 = checkcast:\ub7dc\u156b\u5f50\u9af2\u7330(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub7dc\u156b\u5f50\u9af2\u7330.class, invokeinterface:\ub7dc\u156b\u5f50\u9af2\u7330(Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>::next, var_4_68:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>))
                    
                    if (logicalor:boolean(cmpeq:boolean(getfield:float(\ub7dc\u156b\u5f50\u9af2\u7330::\u0a06\u527a\ucfaf\u3711\u960f, var_5_A5:\ub7dc\u156b\u5f50\u9af2\u7330), ldc:float(-1.0f)), invokevirtual:boolean(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u0b8e\u3d64\u1187\uc2bd\u6d99, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, getfield:float(\ub7dc\u156b\u5f50\u9af2\u7330::\u0a06\u527a\ucfaf\u3711\u960f, var_5_A5:\ub7dc\u156b\u5f50\u9af2\u7330), getfield:\u760c\u6d99\uc910\u1833\u760c\ub6ab(\ub7dc\u156b\u5f50\u9af2\u7330::\u8389\u7e3f\uc3e3\u40a9\uf9c5, var_5_A5:\ub7dc\u156b\u5f50\u9af2\u7330)))) {
                        var_2_B8 = and:int(var_2_B8:int, ldc:int(-300608622))
                        
                        if (cmplt:boolean(invokestatic:double(Math::sqrt, invokevirtual:double(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8d98\u64f2\u97b7\ua6bd\uc229\u51fa, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b))), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_5_A5:\ub7dc\u156b\u5f50\u9af2\u7330))), f2d:double(invokevirtual:float(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\u40a9\u5f50\u8753\u4bc8\u600f\u4ab3, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)))))) {
                            return:boolean(and:int[expected:boolean](ldc:int(26432), ldc:int(-26433)))
                        }
                    }
                    
                    var_2_B8 = and:int(var_2_B8:int, ldc:int(-497633302))
                    loopcontinue()
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_B8:int, ldc:int(16384)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(17025), ldc:int(6253)))
            }
        }
    }
    
    public boolean \u7af6\u4179\u873d\ud217\uc31c(java.util.List<\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub7dc\u156b\u5f50\u9af2\u7330> p0) {
        var_2_61 : int
        var_4_68 : Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>
        var_5_AF : \ub7dc\u156b\u5f50\u9af2\u7330
        var_6_FE : float[]
        
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
        var_2_61 = and:int(ldc:int(783526334), ldc:int(1840409535))
        var_4_68 = invokeinterface:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>(List<\ub7dc\u156b\u5f50\u9af2\u7330>::iterator, p0:List<\ub7dc\u156b\u5f50\u9af2\u7330>)
        
        loop {
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1271600175))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(2143174079))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_68:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>)) {
                    var_5_AF = checkcast:\ub7dc\u156b\u5f50\u9af2\u7330(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub7dc\u156b\u5f50\u9af2\u7330.class, invokeinterface:\ub7dc\u156b\u5f50\u9af2\u7330(Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>::next, var_4_68:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>))
                    
                    if (logicaland:boolean(cmpeq:boolean(getfield:float(\ub7dc\u156b\u5f50\u9af2\u7330::\u0a06\u527a\ucfaf\u3711\u960f, var_5_AF:\ub7dc\u156b\u5f50\u9af2\u7330), ldc:float(-1.0f)), cmplt:boolean(invokestatic:double(Math::sqrt, invokevirtual:double(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8d98\u64f2\u97b7\ua6bd\uc229\u51fa, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b))), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_5_AF:\ub7dc\u156b\u5f50\u9af2\u7330))), f2d:double(invokevirtual:float(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\u40a9\u5f50\u8753\u4bc8\u600f\u4ab3, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b))))))) {
                        var_6_FE = invokestatic:float[](\u4c2b\u3bd6\u385b\uc7fe\u8640::\u6b5f\u6435\u5f50\uc29a\u071d, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_5_AF:\ub7dc\u156b\u5f50\u9af2\u7330), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))
                        invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)), initobject:\ubf56\u392e\u5fe1\u64f2\ud217(\ubf56\u392e\u5fe1\u64f2\ud217::<init>, loadelement:float(var_6_FE:float[], and:int(ldc:int(-4050), ldc:int(4049))), loadelement:float(var_6_FE:float[], xor:int(ldc:int(456), ldc:int(457))), getfield:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u8c8a\u62da\u7c6b\u385b\u3dd3\ud12e, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)))))
                        invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)), initobject:\ubded\u9255\u92ff\u5d20\u97b7(\ubded\u9255\u92ff\u5d20\u97b7::<init>, getstatic:\ub19c\uc229\u416d\ub18d\u7873(\ub19c\uc229\u416d\ub18d\u7873::\u4179\u647c\ubefe\u7af6\u9937\u446c), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_5_AF:\ub7dc\u156b\u5f50\u9af2\u7330), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d)))
                        invokeinterface:void(List<E>::clear, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u4f4a\u6cfe\ub1b9\u99f7\ud171, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))
                        invokeinterface:boolean(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u4f4a\u6cfe\ub1b9\u99f7\ud171, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_5_AF:\ub7dc\u156b\u5f50\u9af2\u7330))
                        return:boolean(and:int[expected:boolean](ldc:int(10503), ldc:int(4617)))
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(2113925562))
                    loopcontinue()
                }
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-22411), ldc:int(5768)))
            }
        }
    }
    
    public boolean \u4492\ua068\ua6bd\u3c25\ufcaf(java.util.List<\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub7dc\u156b\u5f50\u9af2\u7330> p0) {
        var_2_61 : int
        var_4_68 : Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>
        var_2_76 : int
        var_5_B7 : \ub7dc\u156b\u5f50\u9af2\u7330
        var_6_131 : float[]
        
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
        var_2_61 = and:int(ldc:int(1773467961), ldc:int(159376797))
        var_4_68 = invokeinterface:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>(List<\ub7dc\u156b\u5f50\u9af2\u7330>::iterator, p0:List<\ub7dc\u156b\u5f50\u9af2\u7330>)
        
        loop {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_76 = and:int(var_2_61:int, ldc:int(261545733))
            }
            else {
                var_2_76 = and:int(var_2_61:int, ldc:int(-1422698339))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_68:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>)) {
                    var_5_B7 = checkcast:\ub7dc\u156b\u5f50\u9af2\u7330(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub7dc\u156b\u5f50\u9af2\u7330.class, invokeinterface:\ub7dc\u156b\u5f50\u9af2\u7330(Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>::next, var_4_68:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>))
                    
                    if (logicaland:boolean(invokevirtual:boolean(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u0b8e\u3d64\u1187\uc2bd\u6d99, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, getfield:float(\ub7dc\u156b\u5f50\u9af2\u7330::\u0a06\u527a\ucfaf\u3711\u960f, var_5_B7:\ub7dc\u156b\u5f50\u9af2\u7330), getfield:\u760c\u6d99\uc910\u1833\u760c\ub6ab(\ub7dc\u156b\u5f50\u9af2\u7330::\u8389\u7e3f\uc3e3\u40a9\uf9c5, var_5_B7:\ub7dc\u156b\u5f50\u9af2\u7330)), cmplt:boolean(invokestatic:double(Math::sqrt, invokevirtual:double(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8d98\u64f2\u97b7\ua6bd\uc229\u51fa, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b))), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_5_B7:\ub7dc\u156b\u5f50\u9af2\u7330))), f2d:double(invokevirtual:float(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\u40a9\u5f50\u8753\u4bc8\u600f\u4ab3, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b))))))) {
                        if (cmpeq:boolean(rem:int(getfield:int(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b))), xor:int(ldc:int(-31608), ldc:int(-31607))), ldc:int(0))) {
                            var_6_131 = invokestatic:float[](\u4c2b\u3bd6\u385b\uc7fe\u8640::\u6b5f\u6435\u5f50\uc29a\u071d, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_5_B7:\ub7dc\u156b\u5f50\u9af2\u7330), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))
                            invokevirtual:void(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7873\uc7fe\ub83f\u0c95\ub18d\u7330, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)), getstatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u34df\ub113\u6c56\u97e6\u51b2\u4c2b::\uc238\u120d\u516c\u446c\u51fa\u40a9))
                            invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)), initobject:\ubf56\u392e\u5fe1\u64f2\ud217(\ubf56\u392e\u5fe1\u64f2\ud217::<init>, loadelement:float(var_6_131:float[], and:int(ldc:int(-5025), ldc:int(5024))), loadelement:float(var_6_131:float[], xor:int(ldc:int(8214), ldc:int(8215))), getfield:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u8c8a\u62da\u7c6b\u385b\u3dd3\ud12e, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)))))
                            invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)), initobject:\u8df4\ubefe\ubcb0\uc2bd\ua3b4(\u8df4\ubefe\ubcb0\uc2bd\ua3b4::<init>, getstatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u34df\ub113\u6c56\u97e6\u51b2\u4c2b::\uc238\u120d\u516c\u446c\u51fa\u40a9), invokestatic:\ud4fe\u120d\u9a18\u385b\u4492\u5f50(\u4c2b\u3bd6\u385b\uc7fe\u8640::\uf94d\u385b\u7bad\uc84e\u6d69, loadelement:float(var_6_131:float[], and:int(ldc:int(5802), ldc:int(-14059))), loadelement:float(var_6_131:float[], xor:int(ldc:int(20504), ldc:int(20505))), add:float(invokevirtual:float(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\u40a9\u5f50\u8753\u4bc8\u600f\u4ab3, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b))), ldc:float(1.0f)))))
                            invokeinterface:void(List<E>::clear, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u4f4a\u6cfe\ub1b9\u99f7\ud171, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))
                            invokeinterface:boolean(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u4f4a\u6cfe\ub1b9\u99f7\ud171, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_5_B7:\ub7dc\u156b\u5f50\u9af2\u7330))
                        }
                        
                        return:boolean(xor:int[expected:boolean](ldc:int(-32560), ldc:int(-32559)))
                    }
                    
                    var_2_61 = and:int(var_2_76:int, ldc:int(1333615914))
                    loopcontinue()
                }
            }
            
            if (cmpne:boolean(and:int(var_2_76:int, ldc:int(2097152)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(19620), ldc:int(-23718)))
            }
            
            var_2_61 = and:int(var_2_76:int, ldc:int(-524615822))
        }
    }
    
    private void \ubff1\u36d3\u4e72\u47c2\u4179(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ufe34\u40a9\ub6ab\u5fe1\u7330 p0) {
        var_2_61 : int
        var_4_9C : Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>
        var_5_DB : \ub7dc\u156b\u5f50\u9af2\u7330
        var_4_C8 : Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        
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
        var_2_61 = and:int(ldc:int(-1728462006), ldc:int(1055518299))
        
        if (invokevirtual:boolean(\uff55\uc9f6\u5d20\u4f4a\u3c25::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u3e2a\u5d20\u8350\u52d3\ua3b4[expected:\uff55\uc9f6\u5d20\u4f4a\u3c25])) {
            do {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1075287775))
                }
                else {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1518172110))
                    
                    if (cmpne:boolean(getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), aconstnull:List<\ub7dc\u156b\u5f50\u9af2\u7330>())) {
                        loopcontinue()
                    }
                    
                    return:void()
                }
            } while (cmpne:boolean(and:int(var_2_61:int, ldc:int(2048)), ldc:int(0)))
            
            var_4_9C = invokeinterface:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>(List<\ub7dc\u156b\u5f50\u9af2\u7330>::iterator, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_9C:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>)) {
                var_5_DB = checkcast:\ub7dc\u156b\u5f50\u9af2\u7330(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub7dc\u156b\u5f50\u9af2\u7330.class, invokeinterface:\ub7dc\u156b\u5f50\u9af2\u7330(Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>::next, var_4_9C:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>))
            }
            
            var_4_C8 = invokeinterface:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::iterator, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u4f4a\u6cfe\ub1b9\u99f7\ud171, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_C8:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)) {
                invokestatic:void(\u3e2a\u5d20\u8350\u52d3\ua3b4::\uc2bd\ubff1\u3a62\u4f4a\uc238, checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_4_C8:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)))
            }
        }
    }
    
    public static void \uc2bd\ubff1\u3a62\u4f4a\uc238(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_3_7C : double
        var_5_95 : double
        var_7_B1 : double
        var_9_12F : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        
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
            var_3_7C = sub:double(f2d:double(add:float(i2f:float(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:float(0.5f))), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u16f6\u392e\u4c2b\ubf56\u3e75\u960f, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))))))
            var_5_95 = sub:double(f2d:double(add:float(i2f:float(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:float(1.0f))), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc4d2\ud51e\u4f52\u67e9\ud12e\u71f1, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))))))
            var_7_B1 = sub:double(f2d:double(add:float(i2f:float(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:float(0.5f))), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u93a2\u120d\u5fe1\u6198\u93a2\u6d99, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))))))
            invokestatic:void(GL11::glBlendFunc, xor:int(ldc:int(-31509), ldc:int(-30743)), and:int(ldc:int(25351), ldc:int(4883)))
            invokestatic:void(GL11::glEnable, and:int(ldc:int(3046), ldc:int(4090)))
            invokestatic:void(GL11::glEnable, and:int(ldc:int(11172), ldc:int(3872)))
            invokestatic:void(GL11::glLineWidth, ldc:float(1.0f))
            invokestatic:void(GL11::glDisable, xor:int(ldc:int(4224), ldc:int(7521)))
            invokestatic:void(GL11::glDisable, and:int(ldc:int(2943), ldc:int(19441)))
            invokestatic:void(GL11::glDepthMask, and:int[expected:boolean](ldc:int(1102), ldc:int(-1231)))
            invokestatic:void(GL11::glColor4d, ldc:double(1.0), ldc:double(1.0), ldc:double(1.0), ldc:double(1.0))
            var_9_12F = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6ec6\u4daf\ub19c\u3bd6\u6c52\u3711, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u3504\u156b\uc246\u7330\ua068\u7c6b, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, ldc:double(0.0), ldc:double(0.0), ldc:double(1.0)), neg:float(d2f:float(invokestatic:double(Math::toRadians, f2d:double(getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))))))), neg:float(d2f:float(invokestatic:double(Math::toRadians, f2d:double(getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))))))))
            invokestatic:void(GL11::glBegin, xor:int(ldc:int(3648), ldc:int(3649)))
            invokestatic:void(GL11::glVertex3d, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_9_12F:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, var_9_12F:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_9_12F:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))
            invokestatic:void(GL11::glVertex3d, var_3_7C:double, var_5_95:double, var_7_B1:double)
            invokestatic:void(GL11::glEnd)
            invokestatic:void(GL11::glEnable, xor:int(ldc:int(-18756), ldc:int(-17571)))
            invokestatic:void(GL11::glEnable, and:int(ldc:int(7033), ldc:int(12149)))
            invokestatic:void(GL11::glDisable, and:int(ldc:int(11169), ldc:int(19236)))
            invokestatic:void(GL11::glDepthMask, xor:int[expected:boolean](ldc:int(24582), ldc:int(24583)))
            invokestatic:void(GL11::glDisable, xor:int(ldc:int(-13485), ldc:int(-16207)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u0b8e\u3d64\u1187\uc2bd\u6d99(float p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u760c\u6d99\uc910\u1833\u760c\ub6ab p1) {
        var_3_DB : int
        var_5_69 : int
        var_6_74 : Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>
        var_7_F4 : \ub7dc\u156b\u5f50\u9af2\u7330
        stack_143_0 : int [generated]
        
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
            var_3_DB = and:int(ldc:int(-1882356360), ldc:int(1610126492))
            var_5_69 = and:int(ldc:int(-18774), ldc:int(18517))
            var_6_74 = invokeinterface:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>(List<\ub7dc\u156b\u5f50\u9af2\u7330>::iterator, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))
            
            loop {
                if (cmpne:boolean(and:int(var_3_DB:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0191)
                }
                
                if (cmpeq:boolean(and:int(var_3_DB:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_DB = and:int(var_3_DB:int, ldc:int(1071551698))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_6_74:Iterator)) {
                        var_7_F4 = checkcast:\ub7dc\u156b\u5f50\u9af2\u7330(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub7dc\u156b\u5f50\u9af2\u7330.class, invokeinterface:\ub7dc\u156b\u5f50\u9af2\u7330(Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>::next, var_6_74:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>))
                        
                        if (cmpeq:boolean(getfield:float(\ub7dc\u156b\u5f50\u9af2\u7330::\u0a06\u527a\ucfaf\u3711\u960f, var_7_F4:\ub7dc\u156b\u5f50\u9af2\u7330), p0:float)) {
                            if (cmpne:boolean(p0:float, ldc:float(-1.0f))) {
                                if (cmpeq:boolean(getfield:\u760c\u6d99\uc910\u1833\u760c\ub6ab(\ub7dc\u156b\u5f50\u9af2\u7330::\u8389\u7e3f\uc3e3\u40a9\uf9c5, var_7_F4:\ub7dc\u156b\u5f50\u9af2\u7330), p1:\u760c\u6d99\uc910\u1833\u760c\ub6ab)) {
                                    inc:int(var_5_69, ldc:int(1))
                                }
                            }
                        }
                        
                        var_3_DB = and:int(var_3_DB:int, ldc:int(-274999432))
                        loopcontinue()
                    }
                }
                
                Label_0149:
                
                if (cmpne:boolean(and:int(var_3_DB:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_DB:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_DB = and:int(var_3_DB:int, ldc:int(-405239388))
                        loopcontinue()
                    }
                    
                    var_3_DB = and:int(var_3_DB:int, ldc:int(-1948609389))
                    
                    if (cmpgt:boolean(var_5_69:int, and:int(ldc:int(1363), ldc:int(6181)))) {
                        stack_143_0 = xor:int(ldc:int(1076), ldc:int(1077))
                        looporswitchbreak()
                    }
                }
                
                Label_0191:
                
                if (cmpne:boolean(and:int(var_3_DB:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0149)
                }
                
                if (cmpne:boolean(and:int(var_3_DB:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_DB = and:int(var_3_DB:int, ldc:int(-335876585))
                    stack_143_0 = and:int(ldc:int(24786), ldc:int(-26067))
                    looporswitchbreak()
                }
                
                var_3_DB = and:int(var_3_DB:int, ldc:int(-34731364))
            }
            
            return:boolean(stack_143_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void \u47c2\uc31c\u8350\u6d99\u7c6b(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u4cd9\ubff1\ub18d\u99f7\u97e6 p0) {
        var_2_218 : int
        var_4_12F : \u759a\u3504\u6b0d\u5245\ucb79
        var_5_138 : int
        var_6_163 : \ub7dc\u156b\u5f50\u9af2\u7330
        var_4_1BC : \u71f1\u3e2a\u12cb\u8aa5\ub18d
        var_5_1C5 : int
        var_6_1F0 : \ub7dc\u156b\u5f50\u9af2\u7330
        
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
        var_2_218 = and:int(ldc:int(1439121147), ldc:int(-570426153))
        
        if (logicalnot:boolean(invokevirtual:boolean(\uff55\uc9f6\u5d20\u4f4a\u3c25::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u3e2a\u5d20\u8350\u52d3\ua3b4[expected:\uff55\uc9f6\u5d20\u4f4a\u3c25]))) {
            return:void()
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_218:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_218 = and:int(var_2_218:int, ldc:int(-357874388))
                goto(Label_0243)
            }
            
            if (cmpeq:boolean(and:int(var_2_218:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0204)
            }
            
            if (cmpne:boolean(and:int(var_2_218:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_218 = and:int(var_2_218:int, ldc:int(1576499537))
                
                if (cmpeq:boolean(getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), aconstnull:List<\ub7dc\u156b\u5f50\u9af2\u7330>())) {
                    return:void()
                }
            }
            
            Label_0148:
            
            if (cmpeq:boolean(and:int(var_2_218:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0243)
            }
            
            if (cmpeq:boolean(and:int(var_2_218:int, ldc:int(1)), ldc:int(0))) {
                var_2_218 = and:int(var_2_218:int, ldc:int(-1772715396))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_218:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_218 = and:int(var_2_218:int, ldc:int(1617976942))
                    loopcontinue()
                }
                
                var_2_218 = and:int(var_2_218:int, ldc:int(1439168605))
                
                if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u759a\u3504\u6b0d\u5245\ucb79.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20(\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))) {
                    var_4_12F = checkcast:\u759a\u3504\u6b0d\u5245\ucb79(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u759a\u3504\u6b0d\u5245\ucb79.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20[expected:\u759a\u3504\u6b0d\u5245\ucb79](\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))
                    var_5_138 = and:int(ldc:int(-13370), ldc:int(13345))
                    
                    loop {
                        var_2_218 = and:int(var_2_218:int, ldc:int(-639649677))
                        
                        if (cmpge:boolean(var_5_138:int, invokeinterface:int(List<E>::size, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4)))) {
                            looporswitchbreak()
                        }
                        
                        var_6_163 = checkcast:\ub7dc\u156b\u5f50\u9af2\u7330(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub7dc\u156b\u5f50\u9af2\u7330.class, invokeinterface:\ub7dc\u156b\u5f50\u9af2\u7330(List<\ub7dc\u156b\u5f50\u9af2\u7330>::get, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), var_5_138:int))
                        
                        if (invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::equals, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_6_163:\ub7dc\u156b\u5f50\u9af2\u7330), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object](\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokevirtual:double(\u759a\u3504\u6b0d\u5245\ucb79::\u4f4a\uc7fe\u392e\uc2bd\u8640\uc31c, var_4_12F:\u759a\u3504\u6b0d\u5245\ucb79), invokevirtual:double(\u759a\u3504\u6b0d\u5245\ucb79::\u120d\uc31c\u8d90\u74b1\u3bc9\u92ff, var_4_12F:\u759a\u3504\u6b0d\u5245\ucb79), invokevirtual:double(\u759a\u3504\u6b0d\u5245\ucb79::\u7bad\u0b8e\u8cae\ud12e\u6bb9\u965f, var_4_12F:\u759a\u3504\u6b0d\u5245\ucb79)))) {
                            putfield:float(\ub7dc\u156b\u5f50\u9af2\u7330::\u0a06\u527a\ucfaf\u3711\u960f, var_6_163:\ub7dc\u156b\u5f50\u9af2\u7330, invokevirtual:float(\u759a\u3504\u6b0d\u5245\ucb79::\ufe34\ub19c\uafe7\u74b1\u8aa5\u6c56, var_4_12F:\u759a\u3504\u6b0d\u5245\ucb79))
                            invokeinterface:\ub7dc\u156b\u5f50\u9af2\u7330(List<\ub7dc\u156b\u5f50\u9af2\u7330>::set, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), var_5_138:int, var_6_163:\ub7dc\u156b\u5f50\u9af2\u7330)
                        }
                        
                        var_2_218 = and:int(var_2_218:int, ldc:int(1374142457))
                        inc:int(var_5_138, ldc:int(1))
                    }
                }
            }
            
            Label_0204:
            
            if (cmpne:boolean(and:int(var_2_218:int, ldc:int(4096)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_218:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0148)
                }
                
                if (cmpeq:boolean(and:int(var_2_218:int, ldc:int(1)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_218 = and:int(var_2_218:int, ldc:int(-103859751))
                
                if (instanceof:boolean(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u71f1\u3e2a\u12cb\u8aa5\ub18d.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20(\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))) {
                    var_4_1BC = checkcast:\u71f1\u3e2a\u12cb\u8aa5\ub18d(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u71f1\u3e2a\u12cb\u8aa5\ub18d.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20[expected:\u71f1\u3e2a\u12cb\u8aa5\ub18d](\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))
                    var_5_1C5 = and:int(ldc:int(-17500), ldc:int(16474))
                    
                    loop {
                        var_2_218 = and:int(var_2_218:int, ldc:int(-773374497))
                        
                        if (cmpge:boolean(var_5_1C5:int, invokeinterface:int(List<E>::size, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4)))) {
                            looporswitchbreak()
                        }
                        
                        var_6_1F0 = checkcast:\ub7dc\u156b\u5f50\u9af2\u7330(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub7dc\u156b\u5f50\u9af2\u7330.class, invokeinterface:\ub7dc\u156b\u5f50\u9af2\u7330(List<\ub7dc\u156b\u5f50\u9af2\u7330>::get, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), var_5_1C5:int))
                        
                        if (invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::equals, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub7dc\u156b\u5f50\u9af2\u7330::\u839e\u72f1\u6198\u3d64\uafe7, var_6_1F0:\ub7dc\u156b\u5f50\u9af2\u7330), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object](\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokevirtual:double(\u71f1\u3e2a\u12cb\u8aa5\ub18d::\u836c\u7049\ube23\u5d20\uafe7\uc2e8, var_4_1BC:\u71f1\u3e2a\u12cb\u8aa5\ub18d), invokevirtual:double(\u71f1\u3e2a\u12cb\u8aa5\ub18d::\u71ae\u9af2\u0c95\ud158\u97e6\uc229, var_4_1BC:\u71f1\u3e2a\u12cb\u8aa5\ub18d), invokevirtual:double(\u71f1\u3e2a\u12cb\u8aa5\ub18d::\u8bb0\u4f52\u88c5\u6c52\u516c\u67d0, var_4_1BC:\u71f1\u3e2a\u12cb\u8aa5\ub18d)))) {
                            putfield:float(\ub7dc\u156b\u5f50\u9af2\u7330::\u0a06\u527a\ucfaf\u3711\u960f, var_6_1F0:\ub7dc\u156b\u5f50\u9af2\u7330, invokevirtual:float(\u71f1\u3e2a\u12cb\u8aa5\ub18d::\ud12e\uff55\u3711\u71ae\u6fb0\u71ae, var_4_1BC:\u71f1\u3e2a\u12cb\u8aa5\ub18d))
                            invokeinterface:\ub7dc\u156b\u5f50\u9af2\u7330(List<\ub7dc\u156b\u5f50\u9af2\u7330>::set, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), var_5_1C5:int, var_6_1F0:\ub7dc\u156b\u5f50\u9af2\u7330)
                        }
                        
                        var_2_218 = and:int(var_2_218:int, ldc:int(2010069599))
                        inc:int(var_5_1C5, ldc:int(1))
                    }
                }
            }
            
            Label_0243:
            
            if (cmpeq:boolean(and:int(var_2_218:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_218 = and:int(var_2_218:int, ldc:int(1140882931))
                goto(Label_0204)
            }
            
            if (cmpeq:boolean(and:int(var_2_218:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0148)
            }
            
            if (cmpne:boolean(and:int(var_2_218:int, ldc:int(64)), ldc:int(0))) {
                return:void()
            }
        }
    }
    
    public void \ud523\u8389\u5245\u36d3\u5fe1(double p0, double p1, double p2, java.lang.String p3) {
        var_10_120 : \u6fb0\u1187\u12b2\ua068\u5245\u67e9
        
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
            invokestatic:void(GL11::glBlendFunc, xor:int(ldc:int(1593), ldc:int(1339)), and:int(ldc:int(8003), ldc:int(943)))
            invokestatic:void(GL11::glEnable, xor:int(ldc:int(-12693), ldc:int(-14967)))
            invokestatic:void(GL11::glEnable, and:int(ldc:int(19233), ldc:int(11116)))
            invokestatic:void(GL11::glDisable, and:int(ldc:int(3567), ldc:int(3553)))
            invokestatic:void(GL11::glDisable, xor:int(ldc:int(2827), ldc:int(122)))
            invokestatic:void(GL11::glDepthMask, and:int[expected:boolean](ldc:int(19589), ldc:int(-20102)))
            invokestatic:void(GL11::glPushMatrix)
            invokestatic:void(GL11::glTranslated, add:double(sub:double(p0:double, invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u16f6\u392e\u4c2b\ubf56\u3e75\u960f, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)))))), ldc:double(0.5)), add:double(sub:double(p1:double, invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc4d2\ud51e\u4f52\u67e9\ud12e\u71f1, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)))))), ldc:double(1.0)), add:double(sub:double(p2:double, invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u93a2\u120d\u5fe1\u6198\u93a2\u6d99, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)))))), ldc:double(0.5)))
            invokestatic:void(GL11::glAlphaFunc, and:int(ldc:int(12807), ldc:int(2847)), ldc:float(0.0f))
            invokestatic:void(GL11::glRotatef, invokevirtual:float(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u56bd\u6d69\u5140\uae5d\u36d3\u92ff, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)))), ldc:float(0.0f), ldc:float(-1.0f), ldc:float(0.0f))
            invokestatic:void(GL11::glRotatef, invokevirtual:float(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\ub32d\u6d69\u4ab3\uc2bd\u8d98\u600f, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)))), ldc:float(1.0f), ldc:float(0.0f), ldc:float(0.0f))
            var_10_120 = getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ubded\u5654\u120d\u7330\u516c)
            invokestatic:void(GL11::glPushMatrix)
            invokestatic:void(GL11::glScalef, ldc:float(-0.01f), ldc:float(-0.01f), ldc:float(-0.01f))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2, i2f:float(sub:int(div:int(neg:int(invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\u446c\u8bb0\u3776\u446c\u385b\u8308, var_10_120:\u6fb0\u1187\u12b2\ua068\u5245\u67e9, p3:String)), and:int(ldc:int(290), ldc:int(586))), ldc:int(10))), ldc:float(0.0f), i2f:float(add:int(div:int(invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\u446c\u8bb0\u3776\u446c\u385b\u8308, var_10_120:\u6fb0\u1187\u12b2\ua068\u5245\u67e9, p3:String), xor:int(ldc:int(10306), ldc:int(10304))), ldc:int(10))), i2f:float(add:int(invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\ud523\u64f2\u52d3\u97b7\ub113\u7873, var_10_120:\u6fb0\u1187\u12b2\ua068\u5245\u67e9), and:int(ldc:int(16642), ldc:int(6290)))), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), ldc:float(0.4f)))
            invokestatic:void(GL11::glTranslated, i2d:double(div:int(neg:int(invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\u446c\u8bb0\u3776\u446c\u385b\u8308, var_10_120:\u6fb0\u1187\u12b2\ua068\u5245\u67e9, p3:String)), xor:int(ldc:int(4232), ldc:int(4234)))), ldc:double(0.0), ldc:double(0.0))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, var_10_120:\u6fb0\u1187\u12b2\ua068\u5245\u67e9, ldc:float(0.0f), ldc:float(0.0f), p3:String, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)))
            invokestatic:void(GL11::glPopMatrix)
            invokestatic:void(GL11::glPopMatrix)
            invokestatic:void(GL11::glEnable, xor:int(ldc:int(8920), ldc:int(12089)))
            invokestatic:void(GL11::glEnable, and:int(ldc:int(2939), ldc:int(8049)))
            invokestatic:void(GL11::glDisable, xor:int(ldc:int(2782), ldc:int(510)))
            invokestatic:void(GL11::glDepthMask, xor:int[expected:boolean](ldc:int(-31472), ldc:int(-31471)))
            invokestatic:void(GL11::glDisable, xor:int(ldc:int(9427), ldc:int(12081)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub6ab\ube23\uae87\uc84e\u1833() {
        var_1_61 : int
        var_1_1B3 : int
        var_3_1D9 : Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_4_304 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
        var_1_61 = and:int(ldc:int(-499962140), ldc:int(-93093908))
        
        if (invokevirtual:boolean(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\ubb2b\ub8be\uf9c5\u6435\u8bb0\u3d64, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)))) {
            invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\uc84e\u120d\u71ae\u527a\u9937, loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), and:int(ldc:int(24654), ldc:int(2582))))
            invokevirtual:void(\uff55\uc9f6\u5d20\u4f4a\u3c25::\u64ab\u7d52\u5f50\uc3e3\ubb2b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4[expected:\uff55\uc9f6\u5d20\u4f4a\u3c25], and:int[expected:boolean](ldc:int(24785), ldc:int(-24790)))
            return:void()
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0389)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(134217728)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-790326032))
                goto(Label_0271)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(32768)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(568611678))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(-84418770))
                
                if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, getfield:List<String>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6b0d\u7ce1\u88c5\u9a18\u1187, this:\u3e2a\u5d20\u8350\u52d3\ua3b4)))) {
                    putfield:\u7049\u836c\u4179\u3e2a\u6b0d(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6ec6\u8aa5\u34df\u3bc9\ubcb0, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, invokestatic:\u7049\u836c\u4179\u3e2a\u6b0d(\uc3e3\u51b2\u7330\uc238\uc31c::\ud36e\u3776\ud171\uae5d\u3e75, initobject:File(File::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:File[expected:Object](\u6b0d\ua068\uc4d2\u5245\u4d85::\u40a9\u983f\u946b\ud36e\u760c, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))), loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), and:int(ldc:int(7), ldc:int(1039)))), invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, this:\u3e2a\u5d20\u8350\u52d3\ua3b4[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), and:int(ldc:int(2230), ldc:int(4109)))))))))
                    
                    if (cmpne:boolean(getfield:\u7049\u836c\u4179\u3e2a\u6b0d(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6ec6\u8aa5\u34df\u3bc9\ubcb0, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), aconstnull:\u7049\u836c\u4179\u3e2a\u6b0d())) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(-156598538))
                        goto(Label_0271)
                    }
                    
                    invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\uc84e\u120d\u71ae\u527a\u9937, loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), xor:int(ldc:int(17), ldc:int(25))))
                    invokevirtual:void(\uff55\uc9f6\u5d20\u4f4a\u3c25::\u64ab\u7d52\u5f50\uc3e3\ubb2b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4[expected:\uff55\uc9f6\u5d20\u4f4a\u3c25], and:int[expected:boolean](ldc:int(22281), ldc:int(-22298)))
                    return:void()
                }
            }
            
            Label_0169:
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(32768)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-642217611))
                goto(Label_0389)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(524288)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(546892940))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1024)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_61 = and:int(var_1_61:int, ldc:int(-421088083))
                invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\uc84e\u120d\u71ae\u527a\u9937, loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), xor:int(ldc:int(4428), ldc:int(4421))))
                invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\uc84e\u120d\u71ae\u527a\u9937, loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), and:int(ldc:int(90), ldc:int(142))))
                putfield:\u7049\u836c\u4179\u3e2a\u6b0d(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6ec6\u8aa5\u34df\u3bc9\ubcb0, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, invokestatic:\u7049\u836c\u4179\u3e2a\u6b0d(\uc3e3\u51b2\u7330\uc238\uc31c::\ud36e\u3776\ud171\uae5d\u3e75, invokestatic:InputStream(\u5db4\u1187\u647c\u9255\u8258::\ub102\ud4fe\u6b0d\u5245\u8cae, loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), and:int(ldc:int(1563), ldc:int(16655))))))
                
                if (cmpeq:boolean(getfield:\u7049\u836c\u4179\u3e2a\u6b0d(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6ec6\u8aa5\u34df\u3bc9\ubcb0, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), aconstnull:\u7049\u836c\u4179\u3e2a\u6b0d())) {
                    invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\uc84e\u120d\u71ae\u527a\u9937, loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), and:int(ldc:int(31), ldc:int(17964))))
                    invokevirtual:void(\uff55\uc9f6\u5d20\u4f4a\u3c25::\u64ab\u7d52\u5f50\uc3e3\ubb2b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4[expected:\uff55\uc9f6\u5d20\u4f4a\u3c25], and:int[expected:boolean](ldc:int(-18588), ldc:int(18586)))
                    return:void()
                }
            }
            
            Label_0271:
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(134217728)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1768007577))
            }
            else {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0169)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_61 = and:int(var_1_61:int, ldc:int(-421304412))
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(\u7049\u836c\u4179\u3e2a\u6b0d::\u62da\u64ab\u47c2\u8cae\ud36e, getfield:\u7049\u836c\u4179\u3e2a\u6b0d(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6ec6\u8aa5\u34df\u3bc9\ubcb0, this:\u3e2a\u5d20\u8350\u52d3\ua3b4)))
                invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\uc84e\u120d\u71ae\u527a\u9937, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), xor:int(ldc:int(7174), ldc:int(7179)))), invokevirtual:String(\u7049\u836c\u4179\u3e2a\u6b0d::\u62da\u64ab\u47c2\u8cae\ud36e, getfield:\u7049\u836c\u4179\u3e2a\u6b0d(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6ec6\u8aa5\u34df\u3bc9\ubcb0, this:\u3e2a\u5d20\u8350\u52d3\ua3b4)))))
                
                if (cmpne:boolean(invokestatic:double(Math::floor, f2d:double(div:float(ldc:float(20.0f), invokevirtual:float(\u7049\u836c\u4179\u3e2a\u6b0d::\ufcaf\u6d99\uf94d\ub113\ub6ab, getfield:\u7049\u836c\u4179\u3e2a\u6b0d(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6ec6\u8aa5\u34df\u3bc9\ubcb0, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))))), f2d:double(div:float(ldc:float(20.0f), invokevirtual:float(\u7049\u836c\u4179\u3e2a\u6b0d::\ufcaf\u6d99\uf94d\ub113\ub6ab, getfield:\u7049\u836c\u4179\u3e2a\u6b0d(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6ec6\u8aa5\u34df\u3bc9\ubcb0, this:\u3e2a\u5d20\u8350\u52d3\ua3b4)))))) {
                    invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\uc84e\u120d\u71ae\u527a\u9937, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), xor:int(ldc:int(-28160), ldc:int(-28146)))), invokevirtual:float(\u7049\u836c\u4179\u3e2a\u6b0d::\ufcaf\u6d99\uf94d\ub113\ub6ab, getfield:\u7049\u836c\u4179\u3e2a\u6b0d(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u6ec6\u8aa5\u34df\u3bc9\ubcb0, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))), loadelement:String(getstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d), and:int(ldc:int(9455), ldc:int(2063))))))
                }
            }
            
            Label_0389:
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(256)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-104957660))
                goto(Label_0271)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0169)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(262144)), ldc:int(0))) {
                var_1_1B3 = and:int(var_1_61:int, ldc:int(-362039428))
                putfield:int(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7873\u4d85\u836c\ubff1\ubf56, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, and:int(ldc:int(17205), ldc:int(-17214)))
                invokeinterface:void(List<E>::clear, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))
                var_3_1D9 = invokeinterface:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::iterator, invokestatic:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u4c2b\u3bd6\u385b\uc7fe\u8640::\ud171\ub83f\u74b1\u8350\u71ae, invokevirtual:float(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\u40a9\u5f50\u8753\u4bc8\u600f\u4ab3, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)))))
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_3_1D9:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)) {
                    var_4_304 = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_3_1D9:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))
                    
                    if (instanceof:boolean(\u5d20\u7043\u88c5\u5db4\uf94d.\uc87f\ub32d\ud523\u12cb\u4179\u5d20.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b)), var_4_304:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))) {
                        if (cmple:boolean(invokespecial:int(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub171\uc29a\u7e3f\ubded\u9a18, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, initobject:\ub7dc\u156b\u5f50\u9af2\u7330(\ub7dc\u156b\u5f50\u9af2\u7330::<init>, var_4_304:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)), ldc:int(24))) {
                            invokeinterface:boolean(List<\ub7dc\u156b\u5f50\u9af2\u7330>::add, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4), initobject:\ub7dc\u156b\u5f50\u9af2\u7330(\ub7dc\u156b\u5f50\u9af2\u7330::<init>, var_4_304:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
                        }
                    }
                    
                    var_1_1B3 = and:int(var_1_1B3:int, ldc:int(-30708242))
                }
                
                invokevirtual:boolean(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7af6\u4179\u873d\ud217\uc31c, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))
                invokevirtual:boolean(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u4492\ua068\ua6bd\u3c25\ufcaf, this:\u3e2a\u5d20\u8350\u52d3\ua3b4, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))
                return:void()
            }
            
            var_1_61 = and:int(var_1_61:int, ldc:int(2026268137))
        }
    }
    
    private int \ub171\uc29a\u7e3f\ubded\u9a18(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub7dc\u156b\u5f50\u9af2\u7330 p0) {
        var_2_61 : int
        var_4_69 : HashMap<Object, Integer>
        var_5_74 : Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>
        var_6_B4 : \ub7dc\u156b\u5f50\u9af2\u7330
        
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
            var_2_61 = and:int(ldc:int(-741721942), ldc:int(-538378774))
            var_4_69 = initobject:HashMap<Object, Integer>(HashMap<K, V>::<init>)
            var_5_74 = invokeinterface:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>(List<\ub7dc\u156b\u5f50\u9af2\u7330>::iterator, getfield:List<\ub7dc\u156b\u5f50\u9af2\u7330>(\u3e2a\u5d20\u8350\u52d3\ua3b4::\ub8be\uc910\uf9c5\ubded\u385b, this:\u3e2a\u5d20\u8350\u52d3\ua3b4))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(1809135778))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_74:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>))) {
                    looporswitchbreak()
                }
                
                var_6_B4 = checkcast:\ub7dc\u156b\u5f50\u9af2\u7330(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub7dc\u156b\u5f50\u9af2\u7330.class, invokeinterface:\ub7dc\u156b\u5f50\u9af2\u7330(Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>::next, var_5_74:Iterator<\ub7dc\u156b\u5f50\u9af2\u7330>))
                invokevirtual:Integer(HashMap<\u760c\u6d99\uc910\u1833\u760c\ub6ab, Integer>::put, var_4_69:HashMap<\u760c\u6d99\uc910\u1833\u760c\ub6ab, Integer>, getfield:\u760c\u6d99\uc910\u1833\u760c\ub6ab(\ub7dc\u156b\u5f50\u9af2\u7330::\u8389\u7e3f\uc3e3\u40a9\uf9c5, var_6_B4:\ub7dc\u156b\u5f50\u9af2\u7330), invokestatic:Integer(Integer::valueOf, invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(HashMap<Object, Integer>::getOrDefault, var_4_69:HashMap<Object, Integer>, getfield:\u760c\u6d99\uc910\u1833\u760c\ub6ab(\ub7dc\u156b\u5f50\u9af2\u7330::\u8389\u7e3f\uc3e3\u40a9\uf9c5, var_6_B4:\ub7dc\u156b\u5f50\u9af2\u7330), invokestatic:Integer(Integer::valueOf, and:int(ldc:int(-20400), ldc:int(19975))))))))
            }
            
            return:int(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(HashMap<Object, Integer>::getOrDefault, var_4_69:HashMap<Object, Integer>, getfield:\u760c\u6d99\uc910\u1833\u760c\ub6ab[expected:Object](\ub7dc\u156b\u5f50\u9af2\u7330::\u8389\u7e3f\uc3e3\u40a9\uf9c5, p0:\ub7dc\u156b\u5f50\u9af2\u7330), invokestatic:Integer(Integer::valueOf, and:int(ldc:int(-3920), ldc:int(1871)))))))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \uc9f6\u3bd6\uc246\u071d\u759a() {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u5d20\u8350\u52d3\ua3b4::\u64f2\u8350\u0b8e\u64f2\u946b))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_9F : int
        expr_68 : byte[] [generated]
        stack_8A_0 : byte[] [generated]
        stack_8C_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_E2_0 : byte[] [generated]
        stack_345_0 : byte[] [generated]
        stack_39B_0 : byte[] [generated]
        expr_6E : int [generated]
        var_4_2BD : int
        var_3_2C2 : byte[]
        var_5_2C3 : int
        var_0_2CA : int
        expr_2D4 : byte [generated]
        stack_313_2 : byte [generated]
        stack_2F1_0 : byte [generated]
        var_2_8A : byte[]
        expr_8E : int [generated]
        var_3_333 : byte[]
        var_5_334 : int
        expr_B5 : int [generated]
        var_3_389 : byte[]
        var_5_38A : int
        expr_3A1 : byte [generated]
        var_3_EE : String
        stack_2B6_0 : String[] [generated]
        expr_100 : String[] [generated]
        
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
            var_0_9F = and:int(ldc:int(-2031920040), ldc:int(1742099839))
            expr_68 = stack_8A_0 = stack_8C_0 = stack_B3_0 = stack_B5_0 = stack_E2_0 = stack_345_0 = stack_39B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("agsbjvaFDgN6dwMKfX7jdp+H+oF+eWtrAB+deWOHnXljeRsDAwyCf4L/ZYCZdv6FcoOFYnIgmXwAgwLZWxIgmXj1a4ub8wMMgn+C//LgbI6bkIL643kNd++co/r+emQLHF18nwYBA9rep513awuU/oQB/+D8IYB1hAd//H97eY198wxpAx395XQfhQX+dAWH/OILFvcJBuB0IYgAA3wA+HsOhHdjhh13ewuE/XqvKFbQdIqI/WELnnuEBfv95QMd/wT0+QgCYnujhP/hXJYZiWowQFbQdIqI/WELnnuEBfv94fujhPxhYhCkDvti/Zl5B+r7o4T95QCUYACffv8KYoCYYmF2BpB596ui9/+EebGoVFBtd/UJFIqI/N/sExyFgwz8/GD2pIp5/2VlgUvAVFL97eujlP3h/xgFinz/An19YmGKIJd+/2VxDXfvm6L3/4R2AAphBKP6/npkCxxdfJ8GAQPa3qedd+ALHn3j9p+AeAv+d+gEIITjAiP8f4B14AOi43kdf+UHoAUDe94wQFRS+wMD/IKPgv9lgJl2/oJjiJd+4/qChxgFinz/An1+5gMcXoEV/4h8AfoB7AOcewFjsEBRSYCZfACD/d98IITlAx+AduELGnOBi3n9/gAKYP6khf5d+6OE/Gb8Fg=="))
            expr_6E = arraylength:int(expr_68:byte[])
            
            if (cmpne:boolean(expr_6E:int, ldc:int(0))) {
                var_4_2BD = expr_6E:int
                var_3_2C2 = newarray:byte[](byte.class, expr_6E:int)
                var_5_2C3 = expr_6E:int
                
                loop {
                    var_0_2CA = and:int(var_0_9F:int, ldc:int(349663871))
                    var_5_2C3 = add:int(var_5_2C3:int, ldc:int(-1))
                    expr_2D4 = stack_313_2 = loadelement(expr_68, var_5_2C3)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_2C3:int, ldc:int(2)), neg:int(var_4_2BD:int)), ldc:int(0))) {
                        stack_313_2 = stack_2F1_0 = add:byte(expr_2D4:byte, loadelement:byte(var_3_2C2:byte[], add:int(var_5_2C3:int, ldc:int(2))))
                        goto(Label_0769)
                    }
                    
                    Label_0737:
                    
                    if (cmpeq:boolean(and:int(var_0_2CA:int, ldc:int(256)), ldc:int(0))) {
                        var_0_2CA = and:int(var_0_2CA:int, ldc:int(231125240))
                        stack_313_2 = stack_2F1_0 = add:byte(expr_2D4:byte, ldc:byte(2))
                    }
                    
                    Label_0769:
                    
                    if (cmpne:boolean(and:int(var_0_2CA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0737)
                    }
                    
                    var_0_9F = and:int(var_0_2CA:int, ldc:int(769356927))
                    storeelement:byte(var_3_2C2:byte[], var_5_2C3:int, stack_313_2:byte)
                    
                    if (cmpne:boolean(var_5_2C3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8C_0 = stack_8A_0 = stack_B3_0 = stack_B5_0 = stack_E2_0 = stack_345_0 = stack_39B_0 = var_3_2C2:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_9F:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0186)
                }
                
                if (cmpne:boolean(and:int(var_0_9F:int, ldc:int(16)), ldc:int(0))) {
                    var_0_9F = and:int(var_0_9F:int, ldc:int(1154937593))
                    var_2_8A = stack_8A_0:byte[]
                    expr_8E = add:int(arraylength:int(stack_8C_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_8E:int, ldc:int(0))) {
                        var_3_333 = newarray:byte[](byte.class, expr_8E:int)
                        var_5_334 = expr_8E:int
                        
                        loop {
                            var_0_9F = and:int(var_0_9F:int, ldc:int(97665497))
                            var_5_334 = add:int(var_5_334:int, ldc:int(-1))
                            storeelement:byte(var_3_333:byte[], var_5_334:int, add:int(shl:int(loadelement:byte(stack_345_0:byte[], var_5_334:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_8A:byte[], add:int(var_5_334:int, xor:int(ldc:int(18465), ldc:int(18464)))), ldc:int(3)), and:int(ldc:int(287), ldc:int(18015)))))
                            
                            if (cmpne:boolean(var_5_334:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8C_0 = stack_8A_0 = stack_B3_0 = stack_B5_0 = stack_E2_0 = stack_345_0 = stack_39B_0 = var_3_333:byte[]
                    }
                }
                
                Label_0147:
                
                if (cmpeq:boolean(and:int(var_0_9F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_9F = and:int(var_0_9F:int, ldc:int(901061173))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_9F:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_9F = and:int(var_0_9F:int, ldc:int(1994794333))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_3_389 = newarray:byte[](byte.class, expr_B5:int)
                        var_5_38A = expr_B5:int
                        
                        loop {
                            var_0_9F = and:int(var_0_9F:int, ldc:int(-1915505922))
                            var_5_38A = add:int(var_5_38A:int, ldc:int(-1))
                            expr_3A1 = xor:byte(add:byte(loadelement:byte(stack_39B_0:byte[], var_5_38A:int), ldc:byte(121)), ldc:byte(46))
                            storeelement:byte(var_3_389:byte[], var_5_38A:int, or:int(and:int(shl:int(expr_3A1:byte, xor:int(ldc:int(130), ldc:int(134))), ldc:int(-16)), and:int(shr:int(expr_3A1:byte[expected:int], and:int(ldc:int(2060), ldc:int(26214))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_5_38A:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8C_0 = stack_8A_0 = stack_B3_0 = stack_B5_0 = stack_E2_0 = stack_345_0 = stack_39B_0 = var_3_389:byte[]
                    }
                }
                
                Label_0186:
                
                if (cmpne:boolean(and:int(var_0_9F:int, ldc:int(32768)), ldc:int(0))) {
                    var_0_9F = and:int(var_0_9F:int, ldc:int(-1666189278))
                    goto(Label_0147)
                }
                
                if (cmpeq:boolean(and:int(var_0_9F:int, ldc:int(268435456)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_9F = and:int(var_0_9F:int, ldc:int(849867887))
            }
            
            var_3_EE = initobject:String(String::<init>, stack_E2_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_2B6_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(247), ldc:int(231)))
            expr_100 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3129), ldc:int(29648)))
            storeelement:String(expr_100:String[], and:int(ldc:int(16735), ldc:int(559)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, and:int(ldc:int(6464), ldc:int(-6465)), and:int(ldc:int(20766), ldc:int(11353))))
            storeelement:String(expr_100:String[], xor:int(ldc:int(17184), ldc:int(17187)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, xor:int(ldc:int(80), ldc:int(72)), xor:int(ldc:int(18824), ldc:int(18833))))
            storeelement:String(expr_100:String[], and:int(ldc:int(18498), ldc:int(5638)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, xor:int(ldc:int(20999), ldc:int(21022)), xor:int(ldc:int(16661), ldc:int(16648))))
            storeelement:String(expr_100:String[], xor:int(ldc:int(8220), ldc:int(8219)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, xor:int(ldc:int(-8178), ldc:int(-8173)), xor:int(ldc:int(2590), ldc:int(2620))))
            storeelement:String(expr_100:String[], and:int(ldc:int(1667), ldc:int(-1668)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, and:int(ldc:int(39), ldc:int(8234)), and:int(ldc:int(3185), ldc:int(16697))))
            storeelement:String(expr_100:String[], xor:int(ldc:int(-32445), ldc:int(-32434)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, xor:int(ldc:int(16547), ldc:int(16530)), xor:int(ldc:int(19502), ldc:int(19472))))
            storeelement:String(expr_100:String[], and:int(ldc:int(1153), ldc:int(25423)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, xor:int(ldc:int(24668), ldc:int(24674)), and:int(ldc:int(4205), ldc:int(3581))))
            storeelement:String(expr_100:String[], xor:int(ldc:int(51), ldc:int(55)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, and:int(ldc:int(8429), ldc:int(125)), xor:int(ldc:int(16960), ldc:int(16945))))
            storeelement:String(expr_100:String[], xor:int(ldc:int(12553), ldc:int(12546)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, and:int(ldc:int(251), ldc:int(4469)), and:int(ldc:int(17135), ldc:int(8361))))
            storeelement:String(expr_100:String[], xor:int(ldc:int(-32461), ldc:int(-32458)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, xor:int(ldc:int(-16208), ldc:int(-16359)), xor:int(ldc:int(16523), ldc:int(16421))))
            storeelement:String(expr_100:String[], and:int(ldc:int(524), ldc:int(2204)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, and:int(ldc:int(1454), ldc:int(2302)), and:int(ldc:int(17113), ldc:int(8657))))
            storeelement:String(expr_100:String[], and:int(ldc:int(5165), ldc:int(26888)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, xor:int(ldc:int(4169), ldc:int(4248)), xor:int(ldc:int(17507), ldc:int(17773))))
            storeelement:String(expr_100:String[], and:int(ldc:int(18446), ldc:int(8302)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, xor:int(ldc:int(225), ldc:int(495)), xor:int(ldc:int(444), ldc:int(151))))
            storeelement:String(expr_100:String[], and:int(ldc:int(2697), ldc:int(16413)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, xor:int(ldc:int(16786), ldc:int(16569)), and:int(ldc:int(17807), ldc:int(907))))
            storeelement:String(expr_100:String[], and:int(ldc:int(15), ldc:int(17846)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, and:int(ldc:int(16779), ldc:int(9611)), and:int(ldc:int(13822), ldc:int(2495))))
            storeelement:String(expr_100:String[], and:int(ldc:int(17547), ldc:int(30)), invokevirtual:String[expected:String](String::substring, var_3_EE:String, and:int(ldc:int(1470), ldc:int(16894)), xor:int(ldc:int(16420), ldc:int(16834))))
            putstatic:String[](\u3e2a\u5d20\u8350\u52d3\ua3b4::\u7ce1\uc2e8\u7873\u6d99\u6b0d, expr_100:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub19c\u51b2\ud12e\u0b8e\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66E : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_679 : int
        
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
        var_3_66E = and:int(ldc:int(-373105171), ldc:int(1944219085))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3e2a\u5d20\u8350\u52d3\ua3b4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(64)), ldc:int(0))) {
            var_3_66E = and:int(var_3_66E:int, ldc:int(-806327073))
            var_5_81 = and:int(ldc:int(24730), ldc:int(-25535))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4166), ldc:int(-4167)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_66E:int, ldc:int(1138773977))
                    var_9_C7 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_88:int, and:int(ldc:int(593), ldc:int(6145)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(9), ldc:int(8727)))), var_7_97:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_66E = and:int(var_3_D9:int, ldc:int(1912557279))
                    var_14_114 = var_7_97:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(8321), ldc:int(17)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_88:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1219538337))
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1174542686))
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(958178193))
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-945175338))
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0840)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-286391558))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(416776992))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1506013179))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0840)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(821163965))
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0969)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1414969792))
                        goto(Label_0840)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-2065217407))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-2033966398))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-674804501))
                        var_11_EA = and:int(ldc:int(-16465), ldc:int(16464))
                        goto(Label_1509)
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1922828209))
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1693197882))
                        goto(Label_0969)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0840)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-247525373))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(643047561))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1138818811))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0840)
                        }
                    }
                    
                    Label_0697:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(332451238))
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-161026596))
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(2049401254))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1301246345))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-612794425))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1673899381))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-739123237))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0840:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1129735247))
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-326219411))
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-518072776))
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1120632889))
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1762503627))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1475366347))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EA = xor:int(ldc:int(520), ldc:int(521))
                                goto(Label_1113)
                            }
                        }
                    }
                    
                    Label_0969:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1099288767))
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1572979452))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0840)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1807868782))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1575767801))
                        var_11_EA = and:int(ldc:int(-13028), ldc:int(13025))
                    }
                    
                    Label_1113:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1041692638))
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1686397262))
                            goto(Label_0969)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(2095098350))
                            goto(Label_0840)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1311729708))
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(717613912))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(423392467))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-440275253))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1369)
                            }
                        }
                    }
                    
                    Label_1248:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(611346856))
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1113)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0969)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0840)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(64)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-108558919))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1221178678))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-504214323))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_81:int, var_16_118:int)
                            goto(Label_1509)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1369:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1184732720))
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(932771457))
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1034196325))
                        goto(Label_0969)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0840)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(670846481))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1674651221))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66E = and:int(var_3_66E:int, ldc:int(-269393957))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1509:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_679 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1520:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-877846115))
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-877236568))
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1543830895))
                        goto(Label_0840)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1943348360))
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-47886301))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1435424990))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1474419965))
                        var_17_679 = add:int(var_16_118:int, xor:int(ldc:int(45), ldc:int(44)))
                        looporswitchbreak()
                    }
                }
                
                var_3_66E = and:int(var_3_66E:int, ldc:int(1472855791))
                
                if (cmple:boolean(var_5_81 = var_17_679:int, sub:int(var_6_88:int, xor:int(ldc:int(2122), ldc:int(2123))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_66E = and:int(var_3_66E:int, ldc:int(838670846))
            goto(Label_0108)
        }
    }
}
